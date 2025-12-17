class Rectangle {
    private double length, breadth, area, perimeter;

    // Default constructor (optional)
    public Rectangle() {}

    // Parameterized constructor
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to set values (instead of Scanner)
    public void read(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Calculate area and perimeter
    public void calculate() {
        area = length * breadth;
        perimeter = 2 * (length + breadth);
    }

    // Display results
    public void display() {
        System.out.println("Length = " + length);
        System.out.println("Breadth = " + breadth);
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
}
