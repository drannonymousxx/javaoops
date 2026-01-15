package lab4;

abstract class Account {
    static int nextAccNo = 1001;
    int accNo;
    double balance;

    Account(double balance) {
        this.accNo = nextAccNo++;
        this.balance = balance;
    }

    void checkBalance() {
        System.out.println("Acc No: " + accNo + " | Balance: Rs " + balance);
    }

    abstract void withdraw(double amt);

    public boolean equals(Object o) {
        return (o instanceof Account) && accNo == ((Account) o).accNo;
    }
}

class StandardAccount extends Account {
    StandardAccount(double bal) { super(bal); }

    void withdraw(double amt) {
        if (amt <= 100000)
            balance -= amt;
        else if (amt <= 500000)
            balance -= amt + amt * 0.0005;
        else
            System.out.println("Limit exceeded");
    }
}

class PremiumAccount extends Account {
    PremiumAccount(double bal) { super(bal); }

    void withdraw(double amt) {
        if (amt <= 1000000)
            balance -= amt;
        else
            System.out.println("Limit exceeded");
    }
}

public class BankDemo {
    public static void main(String[] args) {

        Account a1 = new StandardAccount(600000);
        Account a2 = new PremiumAccount(1500000);

        a1.checkBalance();
        a1.withdraw(120000);
        a1.checkBalance();

        a2.checkBalance();
        a2.withdraw(900000);
        a2.checkBalance();

        System.out.println(a1.equals(a1));
    }
}

