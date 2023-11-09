package Inheritance.Que1;

public class codebusterGroups extends codebuster {


    public static void main(String[] args) {
        codebusterGroups c = new codebusterGroups();// child class object with class name
        c.groupName(); // call the overide method
    }
    @Override
    public void groupName(){
        System.out.println(" Agile " + " Code1 " + " Code2 " + " Selenium " + " java ");
    }
}