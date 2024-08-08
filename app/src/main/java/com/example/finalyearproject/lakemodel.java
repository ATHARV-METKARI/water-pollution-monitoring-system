package com.example.finalyearproject;

public class lakemodel
{
    String lake,phval,place,pollutionval,turbidityval;

    public lakemodel() {
    }

    public lakemodel(String lake, String phval, String place, String pollutionval, String turbidityval) {
        this.lake = lake;
        this.phval = phval;
        this.place = place;
        this.pollutionval = pollutionval;
        this.turbidityval = turbidityval;
    }

    public String getLake() {
        return lake;
    }

    public void setLake(String lake) {
        this.lake = lake;
    }

    public String getPhval() {
        return phval;
    }

    public void setPhval(String phval) {
        this.phval = phval;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getPollutionval() {
        return pollutionval;
    }

    public void setPollutionval(String pollutionval) {
        this.pollutionval = pollutionval;
    }

    public String getTurbidityval() {
        return turbidityval;
    }

    public void setTurbidityval(String turbidityval) {
        this.turbidityval = turbidityval;
    }
}
