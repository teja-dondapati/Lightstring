package com.LightsApplication.Lightstring.model;

public class Bulb {
    private String color;
    private boolean isOn;

    public Bulb(String color, boolean isOn) {
        this.color = color;
        this.isOn = isOn;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }
}