import java.util.Scanner;

class Account {
    int acc_no;
    double balance;

    void input(Scanner sc) {
        acc_no = sc.nextInt();
        balance = sc.nextDouble();
    }

    void disp() {
        System.out.println("Account No: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}

class Person extends Account {
    String name;
    long aadhar_no;

    void input(Scanner sc) {
        name = sc.next();
        aadhar_no = sc.nextLong();
        super.input(sc);
    }

    void disp() {
        System.out.println("Name: " + name);
        System.out.println("Aadhar No: " + aadhar_no);
        super.disp();
        System.out.println("----------------");
    }
}

public class AccountDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person[] p = new Person[3];

        for (int i = 0; i < 3; i++) {
            p[i] = new Person();
            System.out.println("Enter name, aadhar, acc_no, balance:");
            p[i].input(sc);
        }

        for (int i = 0; i < 3; i++) {
            p[i].disp();
        }
    }
}

