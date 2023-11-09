package Encapculation;

public class TestBankAccount extends BankAccount{
    public static void main(String[] args) {
        TestBankAccount t=new TestBankAccount();
        t.setAccountNumber(0000123456);
        t.setBalance(8000);
        System.out.println(t.getAccountNumber());
        System.out.println(t.getBalance());
    }
}
