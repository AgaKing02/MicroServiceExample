package com.microservice.admissionservice.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/admissions")
public class AdmissionsResource {
    @Autowired
    private RestTemplate restTemplate;

    List<Patient> patients = Arrays.asList(
            new Patient("C1", "Brad", "American"),
            new Patient("C2", "Scott", "American"),
            new Patient("C3", "Raven", "England")
    );
   @RequestMapping("/physicians")
    public EmployeeList getPhysicians() {
        return restTemplate.getForObject("http://hr-service/hr/employees", EmployeeList.class);
    }
    @RequestMapping("/diseases")
    public DiseaseList getDiseases() {
        return restTemplate.getForObject("http://pathology-service/pathology/diseases", DiseaseList.class);
    }
    @RequestMapping("/patients")
    public List<Patient> getPatients() {
        return patients;
    }

    @RequestMapping("/patients/{id}")
    public Patient getPatientById(@PathVariable(name = "id") String id) {
        return patients.stream().filter(patient -> id.equals(patient.getId())).findAny().orElse(null);
    }
}
