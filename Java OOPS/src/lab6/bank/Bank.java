package lab6.bank;

public class Bank {

    // Non-static member (to show access restriction)
    double balance = 100000;

    // Static nested class
    static class InterestCalculator {

        // Static method to calculate Simple Interest
        public static double calculateSI(double principal, double rate, double time) {

            // ❌ NOT allowed (uncommenting gives compile-time error)
            // System.out.println(balance);

            return (principal * rate * time) / 100;
        }
    }

    public static void main(String[] args) {

        // Calling static method of static nested class
        double si = Bank.InterestCalculator.calculateSI(10000, 5, 2);

        System.out.println("Simple Interest is: " + si);
    }
}
