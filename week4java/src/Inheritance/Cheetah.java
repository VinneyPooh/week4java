package Inheritance;

public class Cheetah extends Animal {
    public static void main(String[] args) {
        Cheetah c = new Cheetah(); // child class object
        c.move(); // call override method.
    }
    @Override
    public void move(){
        System.out.println(" Cheetah is wild animal ");

    }

}
