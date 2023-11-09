package Encapculation;
//Write a Java program to create a class called Person with private instance variables  name, age. and country.
// Provide public getter and setter methods to access and modify  these variables.
public class Person {
    private String name;
    private String country;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name= name;
    }
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
