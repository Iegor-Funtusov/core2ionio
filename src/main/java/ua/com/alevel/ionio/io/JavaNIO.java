package ua.com.alevel.ionio.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Iehor Funtusov, created 27/11/2020 - 7:42 PM
 */

public class JavaNIO {

    public void createFile(String fileName) {
        Path path = Paths.get(fileName);
        try {
            Files.createFile(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("path = " + path.toAbsolutePath().toFile().getAbsolutePath());
        System.out.println("path = " + path.toUri());
    }

    public void createDir(String dirName) {
        Path path = Paths.get(dirName);
        try {
            Files.createDirectory(path);
            Files.createTempDirectory("images");

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("path = " + path.toAbsolutePath().toFile().getAbsolutePath());
        System.out.println("path = " + path.toUri());
    }
}
