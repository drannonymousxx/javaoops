class RectArea {
    double length, breadth;

    public RectArea() {
        length = 0;
        breadth = 0;
    }

    public RectArea(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double area() {
        return length * breadth;
    }
}
