package ua.com.alevel.ionio.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * @author Iehor Funtusov, created 24/11/2020 - 9:39 PM
 */

public class SearchTextInFile {

    private final String searchText;
    private final String path;
    private final Set<String> listFiles;

    public SearchTextInFile(String searchText, String path) {
        this.searchText = searchText;
        this.path = path;
        this.listFiles = new HashSet<>();
    }

    public void findAllFilesWhereTextExist() {
        readDirectory(path);
    }

    private void readDirectory(String path) {
        File file = new File(path);
        File[] files = Objects.requireNonNull(file.listFiles());
        for (File currentFile : files) {
            if (currentFile.isDirectory()) {
                readDirectory(currentFile.getPath());
            } else {
                readFile(currentFile);
            }
        }
    }

    private void readFile(File file) {
        try(BufferedReader reader = new BufferedReader(new FileReader(file.getAbsolutePath()))) {
            while (reader.ready()) {
                String currentLine = reader.readLine();
                if (currentLine.contains(searchText)) {
                    listFiles.add(file.getAbsolutePath());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Set<String> getListFiles() {
        return listFiles;
    }
}
