package lab5;
interface Motor {
    // Interface data member (public static final by default)
    int capacity = 5;

    // Abstract methods
    void run();
    void consume();
}

class WashingMachine implements Motor {

    public void run() {
        System.out.println("Washing machine is running");
    }

    public void consume() {
        System.out.println("Washing machine is consuming power");
    }
}

public class MotorDemo {
    public static void main(String[] args) {

        // Interface reference, class object
        Motor wm = new WashingMachine();

        wm.run();
        wm.consume();

        // Accessing interface data member
        System.out.println("Capacity of the motor is " + Motor.capacity);
    }
}
