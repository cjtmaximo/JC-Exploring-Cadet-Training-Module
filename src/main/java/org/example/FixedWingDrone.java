package org.example;

public class FixedWingDrone extends Drone implements AdvancedRecon {
    public FixedWingDrone(String callSign) {
        super(callSign);
    }

    @Override
    public void fly() {
        System.out.println(getCallSign() + " is cruising at high altitude.");
    }

    @Override
    public void takePicture() {
        System.out.println(getCallSign() + " captures high-resolution satellite imagery.");
    }

    @Override
    public void interceptSignal() {
        System.out.println(getCallSign() + " intercepts and analyzes radio frequencies.");
    }

    // Let's override the default method for this advanced drone.
    @Override
    public void record4kVideo() {
        System.out.println("Engaging gimbal-stabilized 4K video recording.");
    }
}