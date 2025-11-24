package com.example.testback.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Table(name = "enrollments")
@Setter
@Getter
@Entity
public class Enrollment {

    @EmbeddedId
    private EnrollmentId enrollmentId = new EnrollmentId();

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("student2Id")
    @JoinColumn(name = "student2_id")
    private Student2 student2;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("course2Id")
    @JoinColumn(name = "course2_id")
    private Course2 course2;

    private LocalDate enrollmentDate;

    private Double grade;



}
