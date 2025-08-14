package org.example;

public abstract class Drone {
    private String callSign;

    public Drone(String callSign) {
        this.callSign = callSign;
    }

    // Concrete method: All drones take off the same way.
    public void takeOff() {
        System.out.println(callSign + " is taking off.");
    }

    // Concrete method: All drones land the same way.
    public void land() {
        System.out.println(callSign + " is landing.");
    }

    // Abstract method: The flight pattern is specific to the drone model.
    // We force subclasses to define how they fly.
    public abstract void fly();

    public String getCallSign() {
        return this.callSign;
    }
}