package com.designpattern.factorypattern;

public class SmallCar extends Car{
    public SmallCar(CarType carType) {
        super(carType);
    }

    @Override
    protected void construct() {
        System.out.println("small car");
    }
}
