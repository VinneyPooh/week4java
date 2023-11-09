package Inheritance;

public class Car extends Vehicle{
    public static void main(String[] args) {
        Car minicooper=new Car(); // child class object
        //minicooper.drive();// Que-2 call override method
        helicopter();//Que-5
        minicooper.Car();//Que-5
        minicooper.calculatingFuelEfficiency();//Que-5
    }
    @Override
    public void drive(){
        System.out.println(" Car is repaired ");
    }

    //Que-5  Write a Java program to create a vehicle class hierarchy. The base class should be  Vehicle, with subclasses Truck, Car and Motorcycle.
    // Each subclass should have  properties such as make, model, year, and fuel type. Implement methods for  calculating fuel efficiency, distance traveled, and maximum speed.
    public void Car() {
        String Make = " Car has a four wheels";
        String fuelType = " electric";
        int model = 7896 - 03;
        int year = 2021;
        System.out.println( Make + fuelType + model + year );
    }
    public void calculatingFuelEfficiency(){
        System.out.println(" cFE");
    }
    public void distanceTravelled(){}
    public void maximumSpeed(){}
}
