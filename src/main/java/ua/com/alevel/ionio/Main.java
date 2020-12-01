package ua.com.alevel.ionio;

import com.google.gson.Gson;
import lombok.SneakyThrows;
import ua.com.alevel.ionio.io.IOClass;
import ua.com.alevel.ionio.io.JavaNIO;
import ua.com.alevel.ionio.io.SearchTextInFile;
import ua.com.alevel.ionio.serialization.Student;
import ua.com.alevel.ionio.stream.StreamTest;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @author Iehor Funtusov, created 24/11/2020 - 6:59 PM
 */

public class Main {

    @SneakyThrows
    public static void main(String[] args) throws IOException {

        StreamTest streamTest = new StreamTest();
        streamTest.testSumInt();
        streamTest.testStream();
        streamTest.convert();


//        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("student.out"));

//        Student student = new Student();
//        student.setFirstName("Александр");
//        student.setLastName("Минаев");
//        student.setFullName(student.getFirstName() + " " + student.getLastName());
//        student.setAge(41);
//        student.setPosition("Java Junior");
//        System.out.println("student before = " + student);
//
//        outputStream.writeObject(student);
//        outputStream.close();
//
//        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("student.out"));
//
//        student = (Student) inputStream.readObject();
//
//        System.out.println("student after = " + student);


//        System.out.println("student = " + student);
//
//        Gson gson = new Gson();
//        String s = gson.toJson(student);
//
//        List<Student> students = new ArrayList<>();
//        students.add(student);
//        students.add(student);
//
//        System.out.println("s = " + s);
//
//        String list = gson.toJson(students);
//        System.out.println("list = " + list);



//        JavaNIO nio = new JavaNIO();
//        nio.createFile("test2.txt");
//        nio.createDir("test2");



//        SearchTextInFile searchTextInFile = new SearchTextInFile("ff", "/home/funtusthan");
//        searchTextInFile.findAllFilesWhereTextExist();
//        Set<String> list = searchTextInFile.getListFiles();
//
//        list.forEach(System.out::println);





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
