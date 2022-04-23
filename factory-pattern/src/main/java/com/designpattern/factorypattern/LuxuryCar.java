package com.designpattern.factorypattern;

public class LuxuryCar extends  Car{

    public LuxuryCar(CarType carType) {
        super(carType);
    }

    @Override
    protected void construct() {
        System.out.println("Construct Luxury car..");
    }
}
