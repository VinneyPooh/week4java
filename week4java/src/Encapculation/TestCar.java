package Encapculation;

public class TestCar extends Car{
    public static void main(String[] args) {
        TestCar c = new TestCar();
        c.setCompany_name("TATA");
        c.setModel_name("Nano");
        c.setYear(2014);
        System.out.println(c.getCompany_name());
        System.out.println(c.getModel_name());
        System.out.println(c.getYear());
        System.out.println(c.getMilege());
    }
}
