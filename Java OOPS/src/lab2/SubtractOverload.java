public class SubtractOverload {

    public int subtract(int a, int b) {
        return a - b;
    }

    public int subtract(int a, int b, int c) {
        return a - b - c;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double subtract(double a, int b) {
        return a - b;
    }

    public int subtract(int[] arr) {
        int res = arr[0];
        for (int i = 1; i < arr.length; i++)
            res -= arr[i];
        return res;
    }

    public static void main(String[] args) {
        SubtractOverload s = new SubtractOverload();

        System.out.println(s.subtract(10, 5));
        System.out.println(s.subtract(20, 5, 3));
        System.out.println(s.subtract(7.5, 1.2));
        System.out.println(s.subtract(10.0, 3));
        System.out.println(s.subtract(new int[]{50, 10, 5}));
    }
}
