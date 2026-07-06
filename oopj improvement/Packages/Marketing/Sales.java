package oopj improvement.Packages.Marketing;

package Marketing;

import General.Employee;

public class Sales extends Employee {

    public Sales(int id, String name) {

        super(id, name);
    }

    public double tallowance(double earnings) {

        return 0.05 * earnings;
    }
}
