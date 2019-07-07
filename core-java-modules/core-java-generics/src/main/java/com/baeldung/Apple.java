package com.baeldung;

public class Apple {
    private String name;
    private Long kilograms;

    public Apple(String name) {
        this.name = name;
    }

    public Apple(String name, Long kilograms) {
        this.name = name;
        this.kilograms = kilograms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getKilograms() {
        return kilograms;
    }

    public void setKilograms(Long kilograms) {
        this.kilograms = kilograms;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "name='" + name + '\'' +
                ", kilograms=" + kilograms +
                '}';
    }
}
