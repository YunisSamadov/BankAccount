package exercise1.BankAccount;

public class BankAccount {

    private int deposit;

    public int getDeposit() {
        return deposit;
    }
    public void deposit(int amount){
        deposit=deposit+amount;
    }
    public void withdraw(int amount){
        if (amount>0&&amount<=deposit){
            deposit=deposit-amount;
        }
    }

}
