package Que8;
//Write a Java program to create a class Employee with a method called  calculateSalary().
// Create two subclasses Manager and Programmer. In each subclass,
// override the calculateSalary() method to calculate and return the salary based on their  specific roles.
public class Employee {
    int hourpay;
    int totalWorkingHours;

    public int calculateSalary(int E_salary){
        E_salary=hourpay*totalWorkingHours;
    return E_salary;
    }
}
