package com.bhashalanka.test.practical_backend.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document (collection = "Student")
public class Student {
    @Id
    private String id;
    private String fName;
    private String lName;
    private LocalDate birthDate;
    private String address;
    private int contact;
    private String course;

    public Student(String id, String fName, String lName, String course) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.course = course;
    }

    public Student(String fName, String lName, LocalDate birthDate, String address, int contact, String course) {
        this.fName = fName;
        this.lName = lName;
        this.birthDate = birthDate;
        this.address = address;
        this.contact = contact;
        this.course = course;
    }
}
