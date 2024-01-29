public class Main {
    public static void main(String[] args) {
        BankAccount s1 = new SavingsAccount("111", "ilayda", 2000);
        BankAccount c1 = new CheckingAccount("222", "ilayda test", 1000);

        s1.deposit(500d);
        s1.withdraw(100d);
        c1.deposit(300d);
        c1.withdraw(200d);
        s1.displayAccountInfo();
        c1.displayAccountInfo();
    }
}