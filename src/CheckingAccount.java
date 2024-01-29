public class CheckingAccount extends BankAccount {

    private double overdraftLimit;

    public CheckingAccount(String accountNumber, String accountHolder, double balance, double overdraftLimit) {
        super(accountNumber, accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public CheckingAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + (amount * 1.5d));
    }

    @Override
    public void withdraw(double amount) {
        overdraftLimit = 0;
        if (getBalance() - amount > overdraftLimit) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Withdrawal amount exceeds overdraft limit.");
        }
    }
}
