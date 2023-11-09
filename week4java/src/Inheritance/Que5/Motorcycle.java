package Inheritance.Que5;

import Inheritance.Que2.Vehicle;

public class Motorcycle extends Vehicle {
    public static void main(String[] args) {
        Motorcycle M = new Motorcycle();
        M.vehicle();

    }
    @Override
    public void vehicle(){
        String Make = " Motorcycle has two wheel";
        String fuelType = " Petrol";
        int modelNumber = 1234-01;
        int year = 2002;
    }
    public void calculatingFuelEfficiency(){
        System.out.println(" cfe ");
    }
    public void distanceTravelled(){
        System.out.println(" distance Travelled ");
    }
    public void maximumSpeed(){
        System.out.println(" maximum speed ");
    }
}
