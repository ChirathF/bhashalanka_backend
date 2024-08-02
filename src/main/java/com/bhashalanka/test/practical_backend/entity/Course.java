package com.bhashalanka.test.practical_backend.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Currency;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document (collection = "Course")
public class Course {
    @Id
    private String id;
    private String courseName;
    private Department department;
    private Currency fee;

    public Course(String courseName, Department department, Currency fee) {
        this.courseName = courseName;
        this.department = department;
        this.fee = fee;
    }

    public enum Department{
        ENGI,BUSMGT,ENG,HOS,HLTH
    }
}

