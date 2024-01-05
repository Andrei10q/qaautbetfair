package oop;

public class Shape {
    public String color;


//    public Shape(String color) {
//        this.color = color;
//    }

    public void draw() {
        System.out.println("Draw a shape");
    }

    public void erase() {
        System.out.println("Erase a shape");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
