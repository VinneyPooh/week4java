package Que9;

public class Panthera extends Animal{
    public static void main(String[] args) {
        Panthera p = new Panthera();
        System.out.println(" Panthera use their " + p.move("Legs"));
        System.out.println(" Panthera voice " + p.makeSound("Ghuurrrrr"));
    }

    public String move(String use){
        return use;

    }
    public String makeSound(String sound){
        return sound;
    }

}
