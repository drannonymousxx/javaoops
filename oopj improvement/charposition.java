package oopj improvement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String s = sc.nextLine();

        System.out.print("Enter Character: ");
        char ch = sc.next().charAt(0);

        int pos = s.indexOf(ch);

        if(pos != -1)
            System.out.println("Character found at position: " + pos);
        else
            System.out.println("Character not found");

        sc.close();
    }
}
