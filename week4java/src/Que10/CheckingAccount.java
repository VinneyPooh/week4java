package Que10;

public class CheckingAccount extends BankAccount  {
    public static void main(String[] args) {
    CheckingAccount ca = new CheckingAccount();
    ca.withdraw();
    }
    public void withdraw(){
        System.out.println("Withdrawal is chargable");
        System.out.println("Under 100, withdrawal is free");
    }
}
