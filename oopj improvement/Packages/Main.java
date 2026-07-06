package oopj improvement.Packages;

import java.util.Scanner;

import Marketing.Sales;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        Sales s = new Sales(id, name);

        double earn = s.earnings(basic);

        double ta = s.tallowance(earn);

        double total = earn + ta;

        System.out.println("\nEmployee ID = " + s.empid);

        System.out.println("Total Earnings = " + total);

        sc.close();
    }
}