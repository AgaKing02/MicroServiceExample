package com.microservice.pathologyservice.resource;

import java.util.List;

public class DiseaseList {
    List<Disease> diseaseList;

    public DiseaseList() {
    }

    public DiseaseList(List<Disease> diseaseList) {
        this.diseaseList = diseaseList;
    }

    public List<Disease> getDiseaseList() {
        return diseaseList;
    }

    public void setDiseaseList(List<Disease> diseaseList) {
        this.diseaseList = diseaseList;
    }
}
