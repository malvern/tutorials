package com.baeldung;

public class Fuji extends Apple {
    private String color;

    public Fuji(String name, Long kilograms, String color) {
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
        return "Fuji{" +
                "color='" + color + '\'' +
                '}';
    }
}
