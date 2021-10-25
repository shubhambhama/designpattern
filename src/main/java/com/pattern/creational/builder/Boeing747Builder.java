package com.pattern.creational.builder;

public class Boeing747Builder extends AircraftBuilder {

    private Boeing747 boeing747;

    @Override
    public void buildCockpit() {
        super.buildCockpit();
    }

    @Override
    public void buildEngine() {
        super.buildEngine();
    }

    @Override
    public void buildWings() {
        super.buildWings();
    }

    @Override
    public void buildBathrooms() {
        super.buildBathrooms();
    }

    @Override
    public IAircraft getResult() {
        return boeing747;
    }
}
