package com.designpattern.factorypattern;

public class SedanCar extends  Car{
    public SedanCar(CarType carType) {
        super(carType);
    }

    @Override
    protected void construct() {
        System.out.println("Sedan car");
    }
}
