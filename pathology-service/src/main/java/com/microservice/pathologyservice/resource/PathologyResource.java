package com.microservice.pathologyservice.resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/pathology")
public class PathologyResource {
    List<Disease> diseaseList = Arrays.asList(
            new Disease("D1", "Basauru", "Citramon ish"),
            new Disease("D2", "Basauru", "Citramon ish"),
            new Disease("D3", "Basauru", "Citramon ish")
    );

    @RequestMapping("/diseases")
    public DiseaseList getDiseaseList() {
        return new DiseaseList(diseaseList);
    }

    @RequestMapping("/diseases/{id}")
    public Disease getDiseaseById(@PathVariable(name = "id") String id) {
        return diseaseList.stream().filter(disease -> id.equals(disease.getId())).findAny().orElse(null);
    }
}
