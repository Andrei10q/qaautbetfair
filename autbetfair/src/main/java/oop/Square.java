package oop;

public class Square extends Shape {

    public void draw(String color) {
        System.out.println("Draw a square with color:"+color);
        super.setColor(color);
    }

    public void draw(){
        this.draw(this.getColor());
    }
}
