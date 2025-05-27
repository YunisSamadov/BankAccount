package exercise1.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(800);
        bankAccount.withdraw(500);
        System.out.println(bankAccount.getDeposit());
    }
}

