package com.microservice.hrservice.resource;

import java.util.List;

public class EmployeeList {
    List<Employee> employees;

    public EmployeeList(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public EmployeeList() {
    }
}
