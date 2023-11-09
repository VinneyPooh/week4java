package Inheritance;
//Write a Java program to create a class called Vehicle with a method called drive().  Create a subclass called Car that overrides the drive() method to print "Repairing a  car".
public class Vehicle {
    public static void main(String[] args) {
        helicopter();

    }
    public void drive(){
        System.out.println("Repairing a car");
    }
    // Que-5
    public static void helicopter() {
        String Make = " Helicopter has  roter blades";
        String fuelType = " diesel";
        String model = "7896-03";
        int year = 2021;
        System.out.println(Make + fuelType + model + year);

    }
}
