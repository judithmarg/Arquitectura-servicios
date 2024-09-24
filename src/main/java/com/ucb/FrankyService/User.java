package com.ucb.FrankyService;

public class User {
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmissionDate() {
        return emissionDate;
    }

    public void setEmissionDate(String emissionDate) {
        this.emissionDate = emissionDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    private String name;
    private String lastName;
    private String ci;
    private String birthDate;
    private String emissionDate;
    private String expirationDate;

    public User(String name, String lastName, String ci, String birthDate, String emissionDate, String expirationDate) {
        this.name = name;
        this.lastName = lastName;
        this.ci = ci;
        this.birthDate = birthDate;
        this.emissionDate = emissionDate;
        this.expirationDate = expirationDate;
    }
}
