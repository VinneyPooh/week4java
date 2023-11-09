package Que10;
//Write a Java program to create a base class BankAccount with methods deposit() and  withdraw().
// Create two subclasses SavingsAccount and CheckingAccount.
// Override the  withdraw() method in each subclass to impose different withdrawal limits and fees.
public class BankAccount {
    int withdraw;
    double fees;
    int balance;
    int cash;

    public void deposit(){

    }
    public void withdraw(){
        System.out.println(withdraw = balance-cash);
    }
}
