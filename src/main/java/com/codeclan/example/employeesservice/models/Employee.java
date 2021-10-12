package com.codeclan.example.employeesservice.models;

import javax.persistence.*;

@Entity
@Table(name= "employees")


public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name= "age")
    private int age;

    @Column(name= "email")
    private String email;

    @Column(name= "employeeNum")
    private int employeeNum;

    public Employee(String name, int age, String email, int employeeNum) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.employeeNum = employeeNum;
    }

    public Employee() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEmployeeNum() {
        return employeeNum;
    }

    public void setEmployeeNum(int employeeNum) {
        this.employeeNum = employeeNum;
    }
}
