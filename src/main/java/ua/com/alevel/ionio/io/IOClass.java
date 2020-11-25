package ua.com.alevel.ionio.io;

import java.io.*;

/**
 * @author Iehor Funtusov, created 24/11/2020 - 7:15 PM
 */

public class IOClass {

    public void createFile(String fileName) throws IOException {
        File file = new File(fileName);
        boolean newFile = file.createNewFile();
    }

    public void createHiddenFile(String fileName) throws IOException {
        File file = new File("." + fileName);
        boolean newFile = file.createNewFile();
    }

    public void createDir(String dirName) throws IOException {
        File file = new File(dirName);
        boolean newFile = file.mkdir();
    }

    public void createDirs(String dirName) throws IOException {
        File file = new File(dirName);
        boolean newFile = file.mkdirs();
    }

    public void removeDir(String dirName) throws IOException {
        File file = new File(dirName);
        boolean deleteFile = file.delete();
        System.out.println("deleteFile = " + deleteFile);
    }

    public String[] allFiles(String dirName) {
        File file = new File(dirName);
        return file.list();
    }

    public void writeToFile(String path, String text) {
        FileWriter fw = null;
        BufferedWriter bw = null;
        PrintWriter out = null;
        try {
            fw = new FileWriter(path, true);
            bw = new BufferedWriter(fw);
            out = new PrintWriter(bw);
            out.println(text);
            out.close();
            bw.close();
            fw.close();
        } catch (IOException e) {
            //exception handling left as an exercise for the reader
        }
    }

    public void readToFile(String path) {
        try(
                FileReader fileReader = new FileReader(path);
                BufferedReader reader = new BufferedReader(new FileReader(path))) {

            int i;
            while((i = fileReader.read()) != -1)     {
                char s = (char) i;
                System.out.print(s);
            }

            while (reader.ready()) {
                String currentLine = reader.readLine();
                System.out.println("currentLine = " + currentLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
