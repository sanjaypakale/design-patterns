package com.designpattern.factorypattern;

public abstract class Car {
    private CarType carType;

    public Car(CarType carType) {
        this.carType = carType;
    }

    protected abstract void construct();
}
