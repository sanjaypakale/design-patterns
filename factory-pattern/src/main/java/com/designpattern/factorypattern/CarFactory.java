package com.designpattern.factorypattern;

public class CarFactory {

    public  static  Car buildCar(CarType carType){
        Car car = null;
        switch (carType){
            case SEDAN:
                car = new SedanCar(carType);
                break;
            case LUXURY:
                car = new LuxuryCar(carType);
                break;
            case SMALL:
                car = new SmallCar(carType);
                break;
        }

        return car;
    }
}
