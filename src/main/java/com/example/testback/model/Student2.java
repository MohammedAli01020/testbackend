package com.example.testback.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Table(name = "students_2")
@Setter
@Getter
@Entity
public class Student2 {
    @Id
    private Long student2Id;

    private String name;

    @OneToMany(mappedBy ="student2", fetch = FetchType.LAZY)
    private List<Enrollment> enrollments;
}
