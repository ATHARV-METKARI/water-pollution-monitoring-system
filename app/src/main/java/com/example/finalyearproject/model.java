package com.example.finalyearproject;

public class model {

    String city, name, ph, turbidity, pollution;

    public model() {
    }

    public model(String city, String name, String ph, String turbidity, String pollution) {
        this.city = city;
        this.name = name;
        this.ph = ph;
        this.turbidity = turbidity;
        this.pollution = pollution;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPh() {
        return ph;
    }

    public void setPh(String ph) {
        this.ph = ph;
    }

    public String getTurbidity() {
        return turbidity;
    }

    public void setTurbidity(String turbidity) {
        this.turbidity = turbidity;
    }

    public String getPollution() {
        return pollution;
    }

    public void setPollution(String pollution) {
        this.pollution = pollution;
    }
}