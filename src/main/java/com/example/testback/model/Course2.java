package com.example.testback.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Table(name = "courses_2")
@Setter
@Getter
@Entity
public class Course2 {

    @Id
    private Long course2Id;

    private String title;

    @OneToMany(mappedBy ="course2")
    private List<Enrollment> enrollments;
}
