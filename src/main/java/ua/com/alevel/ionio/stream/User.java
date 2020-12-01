package ua.com.alevel.ionio.stream;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import ua.com.alevel.ionio.serialization.Student;

/**
 * @author Iehor Funtusov, created 27/11/2020 - 9:37 PM
 */

@Getter
@Setter
@ToString
public class User {

    private String firstName;
    private String lastName;

    public User(Student student) {
        this.firstName = student.getFirstName();
        this.lastName = student.getLastName();
    }
}
