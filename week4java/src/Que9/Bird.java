package Que9;

public class Bird extends Animal{
    public static void main(String[] args) {
        Bird b = new Bird();
        System.out.println(" Birds use their " + b.move("wings"));
        System.out.println(" Koyal bole " + b.makeSound("kuhooo kuhooo"));
    }

    public String move(String use){
        return use;

    }
    public String makeSound(String sound){
        return sound;
    }

}
