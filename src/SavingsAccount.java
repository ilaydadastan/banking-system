public class SavingsAccount extends BankAccount {

    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double calculateInterestRate() {
        interestRate = ((getBalance() * 3) / 100);
        return interestRate;
    }

    @Override
    public void deposit(double amount) {
        setBalance(amount + getBalance() + calculateInterestRate());
    }

    @Override
    public void withdraw(double amount) {
        setBalance(getBalance() - amount);
    }
}
