public class FruitDemo {

    public static void main(String[] args) {

        Apple a;
        a = new Apple();
        a.show();
        a = new Banana();
        a.show();
        a = new Cherry();
        a.show();
    }
}
class Apple {
    void show() {
        System.out.println("This is Apple");
    }
}

class Banana extends Apple {
    void show() {
        System.out.println("This is Banana");
    }
}
class Cherry extends Apple {
    void show() {
        System.out.println("This is Cherry");
    }
}
