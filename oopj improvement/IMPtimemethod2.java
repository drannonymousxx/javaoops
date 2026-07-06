package oopj improvement;
import java.util.Scanner;

class HrsException extends Exception {
    HrsException(String msg) {
        super(msg);
    }
}

class MinException extends Exception {
    MinException(String msg) {
        super(msg);
    }
}

class SecException extends Exception {
    SecException(String msg) {
        super(msg);
    }
}

class Time {

    int hrs, min, sec;

    void getTime(int h, int m, int s)
            throws HrsException,
                   MinException,
                   SecException {

        if(h < 0 || h > 24)
            throw new HrsException(
                    "Hour should be between 0 and 24");

        if(m < 0 || m > 60)
            throw new MinException(
                    "Minute should be between 0 and 60");

        if(s < 0 || s > 60)
            throw new SecException(
                    "Second should be between 0 and 60");

        hrs = h;
        min = m;
        sec = s;

        System.out.println(
                "Correct Time -> "
                + hrs + ":" + min + ":" + sec);
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Hours: ");
        int h = sc.nextInt();

        System.out.print("Enter Minutes: ");
        int m = sc.nextInt();

        System.out.print("Enter Seconds: ");
        int s = sc.nextInt();

        Time t = new Time();

        try {

            t.getTime(h,m,s);

        }

        catch(HrsException e) {

            System.out.println(
                    "Caught Exception");

            System.out.println(e);

        }

        catch(MinException e) {

            System.out.println(
                    "Caught Exception");

            System.out.println(e);

        }

        catch(SecException e) {

            System.out.println(
                    "Caught Exception");

            System.out.println(e);

        }

        sc.close();
    }
}