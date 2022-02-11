package com.company;

public class Tehnika {

    private String name;
    private String model;
    private int year;
    private int baasy;

    public Tehnika(String name, String model, int year, int baasy) {
        this.name = name;
        this.model = model;
        this.year = year;
        this.baasy = baasy;
    }
    public Tehnika(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getBaasy() {
        return baasy;
    }

    public void setBaasy(int baasy) {
        this.baasy = baasy;
    }



}
