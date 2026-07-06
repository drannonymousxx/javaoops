package oopj improvement.Packages.General;
package General;

public class Employee {

    protected int empid;
    private String ename;

    public Employee(int id, String name) {

        empid = id;
        ename = name;
    }

    public double earnings(double basic) {

        double da = 0.80 * basic;

        double hra = 0.15 * basic;

        return basic + da + hra;
    }

    public String getName() {

        return ename;
    }
}
