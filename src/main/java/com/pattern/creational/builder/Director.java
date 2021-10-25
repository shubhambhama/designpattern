package com.pattern.creational.builder;

public class Director {

    private AircraftBuilder aircraftBuilder;

    public Director(AircraftBuilder aircraftBuilder) {
        this.aircraftBuilder = aircraftBuilder;
    }

    public void construct(boolean isPassenger) {
        aircraftBuilder.buildCockpit();
        aircraftBuilder.buildEngine();
        aircraftBuilder.buildWings();
        if (isPassenger) {
            aircraftBuilder.buildBathrooms();
        }
    }
}
