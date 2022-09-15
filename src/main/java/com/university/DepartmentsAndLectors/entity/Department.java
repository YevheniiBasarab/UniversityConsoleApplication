package com.university.DepartmentsAndLectors.entity;

import javax.persistence.*;

@Entity
@Table(name = "department")
public class Department {

    @Id
    @Column(name = "department_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int departmentId;

    @Column(name = "department_name")
    private String departmentName;

    @OneToOne
    @JoinColumn(name="department_head_id")
    private Lector departmentHead;

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                ", departmentHead=" + departmentHead +
                '}';
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public Lector getDepartmentHead() {
        return departmentHead;
    }
//id и name
    //связь на лекторов

}
