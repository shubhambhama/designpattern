package com.pattern.creational.factory;

// Singleton pattern in non-multithreaded environment.
public class PresidentAircraftOne implements IAircraft{

    private PresidentAircraftOne presidentAircraftOne;

    private PresidentAircraftOne() {
        // Do Nothing
    }

    public PresidentAircraftOne getInstance() {
        if (presidentAircraftOne == null) {
            return new PresidentAircraftOne();
        }
        return presidentAircraftOne;
    }

    @Override
    public void fly() {

    }

    @Override
    public void land() {

    }
}
