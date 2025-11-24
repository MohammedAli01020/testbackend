package com.example.testback.model;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class EnrollmentId implements Serializable {

    private Long student2Id;
    private Long course2Id;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EnrollmentId)) return false;
        EnrollmentId that = (EnrollmentId) o;
        return Objects.equals(getStudent2Id(), that.getStudent2Id()) && Objects.equals(getCourse2Id(), that.getCourse2Id());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStudent2Id(), getCourse2Id());
    }
}
