import java.util.*;

abstract class BankAccount {
    double balance;
    BankAccount(double balance) { this.balance = balance; }
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
    void checkBalance() { System.out.println("Balance: " + balance); }
}

class DigitalBank extends BankAccount {
    DigitalBank(double balance) { super(balance); }
    void deposit(double amt) { balance += amt; System.out.println("Deposited: " + amt); }
    void withdraw(double amt) { System.out.println(amt <= balance ? "Withdrawn: " + (balance -= amt) : "Insufficient balance"); }
    void payOnline(double amt) { System.out.println(amt <= balance ? "Paid online: " + (balance -= amt) : "Payment failed"); }
}

public class BankDemo {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            DigitalBank acc = new DigitalBank(s.nextDouble());
            switch (s.next().toLowerCase()) {
                case "deposit": acc.deposit(s.nextDouble()); break;
                case "withdraw": acc.withdraw(s.nextDouble()); break;
                case "balance": acc.checkBalance(); break;
                case "pay": acc.payOnline(s.nextDouble()); break;
                default: System.out.println("Invalid action");
            }
        }
    }
}
