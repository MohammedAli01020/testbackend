package com.example.testback.model;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Table(name = "courses")
@Setter
@Getter
@Entity
public class Course {

    @Id
    private Long course_id;

    private String title;


    @ManyToMany(mappedBy = "courses")
    private List<Student> students;

}
