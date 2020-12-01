package ua.com.alevel.ionio.stream;

import ua.com.alevel.ionio.serialization.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Iehor Funtusov, created 27/11/2020 - 9:07 PM
 */

public class StreamTest {

    public void testSumInt() {
        SumInt sumInt = new SumInt() {
            @Override
            public int square(int a, int b) {
                return a * b;
            }
        };

        sumInt = (a, b) -> a * b;

        System.out.println("sumInt = " + sumInt.square(3, 8));
    }

    public void testStream() {
        List<Integer> integers = Arrays.asList(1,3,5,8,2,56,43,0,4,1);

        int sum = integers.stream().reduce(0, Integer::sum);

        System.out.println("sum = " + sum);

        List<Integer> integers1 = integers.stream()
                .skip(5)
                .distinct()
                .sorted()
                .filter(integer -> integer % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("integers1 = " + integers1);

        List<String> strings = integers1.stream().map(Object::toString).collect(Collectors.toList());
        System.out.println("strings = " + strings);
        String s = strings.stream().collect(Collectors.joining());
        System.out.println("s = " + s);

        String s2 = integers1
                .stream()
                .map(Object::toString)
                .collect(Collectors.joining());

    }

    public void convert() {
        List<Student> students = new ArrayList<>();
        Student student = new Student();
        student.setFirstName("Александр");
        student.setLastName("Минаев");
        student.setFullName(student.getFirstName() + " " + student.getLastName());
        student.setAge(41);
        student.setPosition("Java Junior");
        students.add(student);
        student = new Student();
        student.setFirstName("Александр");
        student.setLastName("Минаев");
        student.setFullName(student.getFirstName() + " " + student.getLastName());
        student.setAge(42);
        student.setPosition("Java Junior");
        students.add(student);
        student = new Student();
        student.setFirstName("Александр");
        student.setLastName("Минаев");
        student.setFullName(student.getFirstName() + " " + student.getLastName());
        student.setAge(43);
        student.setPosition("Java Junior");
        students.add(student);
        student = new Student();
        student.setFirstName("Александр");
        student.setLastName("Минаев");
        student.setFullName(student.getFirstName() + " " + student.getLastName());
        student.setAge(44);
        student.setPosition("Java Junior");
        students.add(student);

        List<User> users = students.stream().map(User::new).collect(Collectors.toList());

        System.out.println("users = " + users);
    }
}
