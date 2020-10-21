package com.microservice.admissionservice.resource;

public class Employee {
    public String id;
    public String name;
    public String surname;
    public String specialty;

    public Employee() {
    }

    public Employee(String id, String name, String surname, String specialty) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.specialty = specialty;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
