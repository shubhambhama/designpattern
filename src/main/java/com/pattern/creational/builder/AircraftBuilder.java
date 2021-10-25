package com.pattern.creational.builder;

public abstract class AircraftBuilder {
    public void buildEngine() {

    }

    public void buildCockpit() {

    }

    public void buildWings() {

    }

    public void buildBathrooms() {

    }

    abstract public IAircraft getResult();
}
