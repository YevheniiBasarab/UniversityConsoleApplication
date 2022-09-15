package com.university.DepartmentsAndLectors.entity;

import javax.persistence.*;

@Entity
@Table (name = "degree")
public class Degree {
    @Id
    @Column(name = "degree_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int degreeId;

    @Column(name = "degree_name")
    private String degreeName;

    @Override
    public String toString() {
        return "Degree{" +
                "degreeId=" + degreeId +
                ", degreeName='" + degreeName + '\'' +
                '}';
    }

//напиать все degree

}
