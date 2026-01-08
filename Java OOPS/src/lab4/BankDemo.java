package lab4;

// Abstract Super Class
abstract class Account {
    protected static int nextAccNo = 1001;

    protected int accountNumber;
    protected String name;
    protected String accountType;
    protected double balance;
    protected int day, month, year;

    // Constructor
    public Account(String name, String accountType, double balance, int day, int month, int year) {
        this.accountNumber = nextAccNo++;
        this.name = name;
        this.accountType = accountType;
        this.balance = balance;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void checkBalance() {
        System.out.println("Account No: " + accountNumber + " | Balance: Rs " + balance);
    }

    public void deposit(double amount, int d, int m, int y) {
        balance += amount;
        day = d;
        month = m;
        year = y;
        System.out.println("Rs " + amount + " deposited successfully.");
    }

    public abstract void withdraw(double amount);

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj instanceof Account) {
            Account acc = (Account) obj;
            return this.accountNumber == acc.accountNumber;
        }
        return false;
    }
}
class StandardAccount extends Account {

    public StandardAccount(String name, double balance, int d, int m, int y) {
        super(name, "Standard", balance, d, m, y);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 100000) {
            balance -= amount;
            System.out.println("Withdrawn Rs " + amount + " (No charge)");
        } else if (amount <= 500000) {
            double penalty = amount * 0.0005;
            balance -= (amount + penalty);
            System.out.println("Withdrawn Rs " + amount + " with penalty Rs " + penalty);
        } else {
            System.out.println("Withdrawal limit exceeded for Standard Account.");
        }
    }
}
class PremiumAccount extends Account {

    public PremiumAccount(String name, double balance, int d, int m, int y) {
        super(name, "Premium", balance, d, m, y);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 1000000) {
            balance -= amount;
            System.out.println("Withdrawn Rs " + amount + " successfully.");
        } else {
            System.out.println("Daily withdrawal limit exceeded (Rs 10 lakh).");
        }
    }
}

// Main Class
public class BankDemo {
    public static void main(String[] args) {

        Account acc1 = new StandardAccount("Rahul", 600000, 1, 1, 2025);
        Account acc2 = new PremiumAccount("Anita", 1500000, 2, 1, 2025);

        System.out.println("\n--- Standard Account Transactions ---");
        acc1.checkBalance();
        acc1.withdraw(120000);
        acc1.checkBalance();

        System.out.println("\n--- Premium Account Transactions ---");
        acc2.checkBalance();
        acc2.withdraw(900000);
        acc2.checkBalance();

        System.out.println("\n--- equals() Method Demo ---");
        Account acc3 = acc1;
        System.out.println("acc1 equals acc3 ? " + acc1.equals(acc3));
    }
}
