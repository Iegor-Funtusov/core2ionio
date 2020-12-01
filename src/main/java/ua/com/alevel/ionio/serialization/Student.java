package ua.com.alevel.ionio.serialization;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author Iehor Funtusov, created 27/11/2020 - 8:20 PM
 */

@Getter
@Setter
@ToString
public class Student implements Serializable {

    private String firstName;
    private String lastName;
    private transient String fullName;
    private String position;
    private int age;
}
