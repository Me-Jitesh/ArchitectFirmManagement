package com.spacev.ArchitectFirmBackEnd.entities;

import java.sql.Timestamp;

public class AddProject {

    private int p_id;
    private String name;
    private String email;
    private String inputAddress;
    private String inputResAddress;
    private String inputCity;
    private String inputDist;
    private int inputArea;
    private String unit;
    private String requirement;
    private String document;
    private String drawings;
    private String comment;
    private Timestamp time;

    public AddProject() {
    }

    public AddProject(String name, String email, String inputAddress, String inputResAddress, String inputCity, String inputDist, int inputArea, String unit, String requirement, String document, String drawings, String comment) {
        this.name = name;
        this.email = email;
        this.inputAddress = inputAddress;
        this.inputResAddress = inputResAddress;
        this.inputCity = inputCity;
        this.inputDist = inputDist;
        this.inputArea = inputArea;
        this.unit = unit;
        this.requirement = requirement;
        this.document = document;
        this.drawings = drawings;
        this.comment = comment;
    }

    public AddProject(int p_id, String name, String email, String inputAddress, String inputResAddress, String inputCity, String inputDist, int inputArea, String unit, String requirement, String document, String drawings, String comment, Timestamp time) {
        this.p_id = p_id;
        this.name = name;
        this.email = email;
        this.inputAddress = inputAddress;
        this.inputResAddress = inputResAddress;
        this.inputCity = inputCity;
        this.inputDist = inputDist;
        this.inputArea = inputArea;
        this.unit = unit;
        this.requirement = requirement;
        this.document = document;
        this.drawings = drawings;
        this.comment = comment;
        this.time = time;
    }

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInputAddress() {
        return inputAddress;
    }

    public void setInputAddress(String inputAddress) {
        this.inputAddress = inputAddress;
    }

    public String getInputResAddress() {
        return inputResAddress;
    }

    public void setInputResAddress(String inputResAddress) {
        this.inputResAddress = inputResAddress;
    }

    public String getInputCity() {
        return inputCity;
    }

    public void setInputCity(String inputCity) {
        this.inputCity = inputCity;
    }

    public String getInputDist() {
        return inputDist;
    }

    public void setInputDist(String inputDist) {
        this.inputDist = inputDist;
    }

    public int getInputArea() {
        return inputArea;
    }

    public void setInputArea(int inputArea) {
        this.inputArea = inputArea;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getDrawings() {
        return drawings;
    }

    public void setDrawings(String drawings) {
        this.drawings = drawings;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }
}
