package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Employee")
public class Employee {
    @Id
    private int employeeID;
    private String name;
    private String surname;
    private int pasportNumber;
    private int pasportDate;
    private double salary;

    public Employee() {
    }

    public Employee(int employeeID, String name, String surname, int pasportNumber, int pasportDate, double salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.surname = surname;
        this.pasportNumber = pasportNumber;
        this.pasportDate = pasportDate;
        this.salary = salary;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public double getSalary() {
        return salary;
    }

    public int getPasportDate() {
        return pasportDate;
    }

    public int getPasportNumber() {
        return pasportNumber;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPasportNumber(int pasportNumber) {
        this.pasportNumber = pasportNumber;
    }

    public void setPasportDate(int pasportDate) {
        this.pasportDate = pasportDate;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
