class Box {
    double length, width, height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public double volume() {
        return length * width * height;
    }   

    public static void main(String[] args) {
        Box box = new Box(2.0, 3.0, 4.0);
        System.out.println("Volume of the box: " + box.volume());
    }   
}