package oopj improvement;

class Apple {

    void show() {
        System.out.println("Apple Show Method");
    }
}

class Banana extends Apple {

    void show() {
        System.out.println("Banana Show Method");
    }
}

class Cherry extends Apple {

    void show() {
        System.out.println("Cherry Show Method");
    }
}

class Main {

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
