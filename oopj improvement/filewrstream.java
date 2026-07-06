package oopj improvement;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter Source File: ");
            String source = sc.nextLine();

            System.out.print("Enter Destination File: ");
            String destination = sc.nextLine();

            FileReader fr =
                    new FileReader(source);

            FileWriter fw =
                    new FileWriter(destination);

            int ch;

            while((ch = fr.read()) != -1) {

                fw.write(ch);
            }

            fr.close();
            fw.close();

            System.out.println("File Copied");
        }

        catch(Exception e) {

            System.out.println(e);
        }

        sc.close();
    }
}
/*import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter Source File: ");
            String source = sc.nextLine();

            System.out.print("Enter Destination File: ");
            String destination = sc.nextLine();

            FileInputStream fin =
                    new FileInputStream(source);

            FileOutputStream fout =
                    new FileOutputStream(destination);

            int b;

            while((b = fin.read()) != -1) {

                fout.write(b);
            }

            fin.close();
            fout.close();

            System.out.println("File Copied");
        }

        catch(Exception e) {

            System.out.println(e);
        }

        sc.close();
    }
}*/