package com.example.injection;

public class Car {
    private Engine engine;
    private String color;

    // Constructor injection
    public Car(Engine engine) {
        this.engine = engine;
    }

    // Setter injection
    public void setColor(String color) {
        this.color = color;
    }

    public void displayInfo() {
        System.out.println("Car with engine: " + engine.getType() + " and color: " + color);
    }
}
