import java.util.Scanner;

class Box {
    double l, w, h;

    Box(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    double volume() {
        return l * w * h;
    }
}

public class Demo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Box b = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

        System.out.println("Volume: " + b.volume());
        sc.close();
    }
}

