package task5;

public class Circle {
    private double radius;
    static final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static double getPI() {
        return PI;
    }

    public double area() {
        return radius * PI;
    }

    public double circumference() {
        return 2 * PI * radius;
    }
}
