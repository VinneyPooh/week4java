package Que8;

public class Manager extends Employee{
    public static void main(String[] args) {
    Manager m=new Manager();
        System.out.println(" Manager salary = " + m.calculateSalary(100000));
    }

    @Override
    public int calculateSalary(int M_salary) {
        return M_salary;
    }
}
