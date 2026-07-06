package oopj improvement;

interface Motor {

    int capacity = 5;

    void run();

    void consume();
}

class WashingMachine implements Motor {

    public void run() {
        System.out.println("Motor is Running");
    }

    public void consume() {
        System.out.println("Motor is Consuming Power");
    }
}

class Main {

    public static void main(String[] args) {

        WashingMachine wm = new WashingMachine();

        wm.run();

        wm.consume();

        System.out.println("Capacity of the Motor is = " + wm.capacity);
    }
}