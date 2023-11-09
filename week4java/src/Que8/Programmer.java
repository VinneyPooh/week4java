package Que8;

public class Programmer extends Employee {

    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println("Programmer salary = " +p.calculateSalary(75000));
    }

    @Override
    public int calculateSalary(int P_salary) {
        return P_salary;
    }
}
