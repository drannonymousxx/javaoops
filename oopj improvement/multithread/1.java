package oopj improvement.multithread;

import java.util.Scanner;

class CounterThread extends Thread {

    int low, high;

    CounterThread(String name, int low, int high) {

        setName(name);

        this.low = low;
        this.high = high;
    }

    public void run() {

        System.out.println("Thread : " + getName());

        System.out.print("Counter : ");

        for(int i = low; i <= high; i++) {

            System.out.print(i + " ");

            try {

                Thread.sleep(5);

            }

            catch(Exception e) {

                System.out.println(e);
            }
        }
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Thread Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Lower Range: ");
        int low = sc.nextInt();

        System.out.print("Enter Upper Range: ");
        int high = sc.nextInt();

        CounterThread t =
            new CounterThread(name, low, high);

        t.start();

        sc.close();
    }
}