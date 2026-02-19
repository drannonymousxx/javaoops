package lab5;
interface Motor {
    int capacity = 5;
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
        Motor wm = new WashingMachine();

        wm.run();
        wm.consume();
        System.out.println("Capacity of the motor is " + Motor.capacity);
    }
}
