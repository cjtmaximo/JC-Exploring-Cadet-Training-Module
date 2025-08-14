package org.example;

public class QuadCopter extends Drone implements VisualRecon {
    public QuadCopter(String callSign) {
        super(callSign); // Call the parent constructor
    }

    // Implementing the abstract method from the Drone class
    @Override
    public void fly() {
        System.out.println(getCallSign() + " is hovering with four rotors.");
    }

    // Implementing the abstract method from the VisualRecon interface
    @Override
    public void takePicture() {
        System.out.println(getCallSign() + " takes a picture with its " + SENSOR_TYPE);
    }
}