package com.university.DepartmentsAndLectors.entity;

import javax.persistence.*;

@Entity
@Table(name = "lector")
public class Lector {
    @Id
    @Column(name = "lector_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int lectorId;

    @Column(name = "lector_name")
    private String lectorName;

    @Column(name = "lector_salary")
    private double lectorSalary;

    @OneToOne
    @JoinColumn(name="lector_degree_id")
    private Degree lectorDegree;

    @Override
    public String toString() {
        return "Lector{" +
                "lectorId=" + lectorId +
                ", lectorName='" + lectorName + '\'' +
                ", lectorSalary=" + lectorSalary +
                ", lectorDegree=" + lectorDegree +
                '}';
    }

    public int getLectorId() {
        return lectorId;
    }

    public String getLectorName() {
        return lectorName;
    }

    public double getLectorSalary() {
        return lectorSalary;
    }

    public Degree getLectorDegree() {
        return lectorDegree;
    }
//добавить связь на department

}
