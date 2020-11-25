package ua.com.alevel.ionio;

import ua.com.alevel.ionio.io.IOClass;
import ua.com.alevel.ionio.io.SearchTextInFile;

import java.io.IOException;
import java.util.Set;

/**
 * @author Iehor Funtusov, created 24/11/2020 - 6:59 PM
 */
public class Main {

    public static void main(String[] args) throws IOException {

        SearchTextInFile searchTextInFile = new SearchTextInFile("ff", "/home/funtusthan");
        searchTextInFile.findAllFilesWhereTextExist();
        Set<String> list = searchTextInFile.getListFiles();

        list.forEach(System.out::println);


//        IOClass ioClass = new IOClass();
//        ioClass.createFile("text");
//        ioClass.createHiddenFile("text.txt");
//        ioClass.createDirs("testA/testB/testC");
//        ioClass.createDir("test/test");
//        ioClass.createFile("testA/testB/testC/testD/file.txt");
//        ioClass.createFile("testA/testB/testC/testD/file.txt");
//        ioClass.removeDir("testA/testB/testC/testD/file.txt");
//        ioClass.removeDir("testA/testB/testC/testD/");
//        ioClass.removeDir("testA/testB/testC/");
//        String[] dirs = ioClass.allFiles("testA/testB/testC/testD");
//        for (String dir : dirs) {
//            System.out.println("dir = " + dir);
//        }
//        ioClass.writeToFile("testA/testB/testC/testD/file.txt", "Hello World!!!");
//        ioClass.readToFile("testA/testB/testC/testD/file.txt");
    }
}
