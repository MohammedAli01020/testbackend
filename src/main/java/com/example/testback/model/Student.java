package com.example.testback.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Table(name = "students")
@Setter
@Getter
@Entity
public class Student {

    @Id
    private Long student_id;

    private String name;

    @ManyToMany
    @JoinTable(
            name = "student-course",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private List<Course> courses;
}
