package com.pattern.creational.factory;

// Singleton pattern in multithreaded environment.
public class PresidentAircraftTwo implements IAircraft{

    private PresidentAircraftTwo presidentAircraftTwo;

    private PresidentAircraftTwo() {
        // Do Nothing
    }

    // This is called Double check locking.
    public synchronized PresidentAircraftTwo getInstance() {
        if (presidentAircraftTwo == null) {
            synchronized (PresidentAircraftTwo.class) {
                if (presidentAircraftTwo == null) {
                    return new PresidentAircraftTwo();
                }
            }
        }
        return presidentAircraftTwo;
    }

    @Override
    public void fly() {
        System.out.println("Flying president aircraft two");
    }

    @Override
    public void land() {
        System.out.println("Landing president aircraft two");
    }
}
