package oop;

public class Circle extends Shape {
    public static String name = "Cerc1";
    private double radius;

    public Circle(double radius) {
        this.radius=radius;
    }

    public Circle() {
        super();
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
       return 3.14 * radius * radius;
    }

    public static void setName(String name) {
        Circle.name=name;
    }
}
