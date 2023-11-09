package Inheritance.Que5;

import Inheritance.Que2.Vehicle;

public class Car extends Vehicle {
    public static void main(String[] args) {
        Car minicooper=new Car(); // child class object
        minicooper.vehicle();
        minicooper.calculatingFuelEfficiency();
    }

@Override
    public void vehicle() {
        String Make = " Car has a four wheels";
        String fuelType = " electric";
        int model = 7896 - 03;
        int year = 2021;
        System.out.println( "make = "+ Make + "Fuel Type = "+ fuelType    + "Model = "+ model   + "year = "+ year );
    }
    public void calculatingFuelEfficiency(){
        System.out.println(" cFE");
    }
    public void distanceTravelled(){
        System.out.println(" Distance travelled");
    }
    public void maximumSpeed(){
        System.out.println(" Maximum speed ");
    }
}
