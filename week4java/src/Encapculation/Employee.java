package Encapculation;
//Write a Java program to create a class called Employee with private instance variables  employee_id, employee_name, and employee_salary.
// Provide public getter and setter  methods to access and modify the id and name variables, but provide a getter method  for the salary variable that returns a formatted string.
public class Employee {
    private int Employee_Id;
    private String Employee_Name;
    private String Employee_Salary;

    public void setEmployee_Id(int employee_Id) {
        Employee_Id = employee_Id;
    }

    public void setEmployee_Name(String employee_Name) {
        Employee_Name = employee_Name;
    }
    public int getEmployee_Id() {
        return Employee_Id;
    }

    public String getEmployee_Name() {
        return Employee_Name;
    }

    public String getEmployee_Salary() {
        return Employee_Salary;
    }
}
