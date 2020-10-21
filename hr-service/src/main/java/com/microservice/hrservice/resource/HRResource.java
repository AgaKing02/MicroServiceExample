package com.microservice.hrservice.resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/hr")
public class HRResource {
    List<Employee> employeeList= Arrays.asList(
            new Employee("E1","Aga","Pey","Surge"),
            new Employee("E2","Zhako","Myr","Medbrat"),
            new Employee("E3","Beka","Akh","Medbrat")
    );

    @RequestMapping("/employees")
    public EmployeeList getEmployeeList() {
        return new EmployeeList(employeeList);
    }

    @RequestMapping("/employees/{id}")
    public Employee getEmployeetById(@PathVariable(name = "id") String id) {
        return employeeList.stream().filter(employee -> id.equals(employee.getId())).findAny().orElse(null);
    }
}

