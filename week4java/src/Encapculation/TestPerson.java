package Encapculation;

public class TestPerson extends Person {
    public static void main(String[] args) {
        TestPerson t=new TestPerson();
        t.setAge(12);
        t.setName("xyz");
        t.setCountry("UK");

        System.out.println(t.getName());
        System.out.println(t.getCountry());
        System.out.println(t.getAge());
    }
}
