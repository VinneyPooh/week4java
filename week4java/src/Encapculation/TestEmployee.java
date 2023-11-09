package Encapculation;

public class TestEmployee extends Employee {
    public static void main(String[] args) {
        TestEmployee t = new TestEmployee();
        t.setEmployee_Id(9870);
        System.out.println(t.getEmployee_Id());
        t.setEmployee_Name("pqrsh");
        System.out.println(t.getEmployee_Name());
        System.out.println("Fifty thousand" + t.getEmployee_Salary());

    }
}
