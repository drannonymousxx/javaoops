package lab6.Marketing;

import lab6.General.employee;

public class sales extends employee {

    public sales(int empid, String ename, double basic) {
        super(empid, ename, basic);
    }

    public double tallowance() {
        return 0.05 * earnings();
    }

    public static void main(String[] args) {
        int empid = 123;
        String ename = "Amit";
        double basic = 1000;

        sales s = new sales(empid, ename, basic);

        System.out.println("The emp id of the employee is " + s.getEmpId());
        System.out.println("The total earning is " + s.earnings());
    }
}
