package Inheritance.Que5;


import Inheritance.Que2.Vehicle;

public class Truck extends Vehicle {
    public static void main(String[] args) {
        Truck t = new Truck();
        t.vehicle();

    }
    @Override
    public void vehicle(){
        String Make=" Truck has six wheel";
        String fuelType =" Diesel";
        int modelNumber =456789-02;
        int year=1990;
    }
    public void calculatingFuelEfficiency(){
        System.out.println(" cfe ");
    }
    public void distanceTravelled(){
        System.out.println(" distance travelled ");
    }
    public void maximumSpeed(){
        System.out.println(" maximum speed ");
    }
}
