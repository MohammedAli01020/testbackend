package com.example.testback.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
public class Employee {

    @Id
    @Column(name = "employee_id")
    private Long employeeId;

    private String name;

    private Integer age;

    @ManyToOne
    @JoinColumn(name = "supervisor_id")
    private Employee supervisor;


    @OneToMany(mappedBy = "supervisor")
    private List<Employee> workers;

}
