package lab6.bank;

public class Bank {

    double balance = 100000;

  
    static class InterestCalculator {

        public static double calculateSI(double principal, double rate, double time) {

            return (principal * rate * time) / 100;
        }
    }

    public static void main(String[] args) {

        double si = Bank.InterestCalculator.calculateSI(10000, 5, 2);

        System.out.println("Simple Interest is: " + si);
    }
}
