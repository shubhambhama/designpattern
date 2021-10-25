package com.pattern.creational.builder;

public class F16Builder extends AircraftBuilder {

    private F16 f16;

    @Override
    public void buildCockpit() {
        super.buildCockpit();
    }

    @Override
    public void buildWings() {
        super.buildWings();
    }

    @Override
    public void buildEngine() {
        super.buildEngine();
    }

    @Override
    public IAircraft getResult() {
        return f16;
    }
}
