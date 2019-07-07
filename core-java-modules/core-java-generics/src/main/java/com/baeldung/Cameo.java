package com.baeldung;

public class Cameo extends Apple {
    private String color;

    public Cameo(String name, Long kilograms, String color) {
        super(name, kilograms);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cameo{" +
                "color='" + color + '\'' +
                '}';
    }
}
