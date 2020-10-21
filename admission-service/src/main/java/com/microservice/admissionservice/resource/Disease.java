package com.microservice.admissionservice.resource;

public class Disease {
    public String id;
    public String description;
    public String treatment;

    public Disease() {
    }

    public Disease(String id, String description, String treatment) {
        this.id = id;
        this.description = description;
        this.treatment = treatment;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }
}
