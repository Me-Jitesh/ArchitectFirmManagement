package com.spacev.ArchitectFirmBackEnd.entities;

import java.sql.Timestamp;

public class Customers {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String passwordEncrypted;
    private String phone;
    private String securityQuestion;
    private String securityAnswer;
    private Timestamp dateTime;

    public Customers() {
    }

    public Customers(String firstName, String lastName, String email, String password, String passwordEncrypted, String phone, String securityQuestion, String securityAnswer) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.passwordEncrypted = passwordEncrypted;
        this.phone = phone;
        this.securityQuestion = securityQuestion;
        this.securityAnswer = securityAnswer;
    }

    public Customers(int id, String firstName, String lastName, String email, String password, String passwordEncrypted, String phone, String securityQuestion, String securityAnswer, Timestamp dateTime) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.passwordEncrypted = passwordEncrypted;
        this.phone = phone;
        this.securityQuestion = securityQuestion;
        this.securityAnswer = securityAnswer;
        this.dateTime = dateTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordEncrypted() {
        return passwordEncrypted;
    }

    public void setPasswordEncrypted(String passwordEncrypted) {
        this.passwordEncrypted = passwordEncrypted;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSecurityQuestion() {
        return securityQuestion;
    }

    public void setSecurityQuestion(String securityQuestion) {
        this.securityQuestion = securityQuestion;
    }

    public String getSecurityAnswer() {
        return securityAnswer;
    }

    public void setSecurityAnswer(String securityAnswer) {
        this.securityAnswer = securityAnswer;
    }

    public Timestamp getDateTime() {
        return dateTime;
    }

    public void setDateTime(Timestamp dateTime) {
        this.dateTime = dateTime;
    }

}


