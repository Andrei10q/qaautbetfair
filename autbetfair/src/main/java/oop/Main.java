package oop;

import courses.javabasics.Draw;

import java.awt.*;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(3);
        Circle.setName("Cerc1");
        System.out.println("Aria cercului:" + circle.getArea());

        Circle circle1 = new Circle(4);
        System.out.println("Aria cercului:" + circle1.getArea());
        Circle.setName("Cerc2");
        System.out.println("Circle name:" + Circle.name);
        Draw.drawFullShape(4);

        CarBrands carBrands = new CarBrands();
        carBrands.setBrand("Dacia");
        carBrands.setModel("Duster");
        carBrands.setFuelType(FuelType.DIESEL);
        System.out.println("Car:brand:" + carBrands.getBrand() + ",model:" + carBrands.getModel());
        System.out.println(carBrands);
        Car car = new Car(carBrands, Color.BLUE, 80);
        System.out.println(car);
        Circle circle2 = new Circle();
        circle2.draw();
        Triangle tr = new Triangle();
        tr.draw();
        Square sq = new Square();
        sq.setColor("red");
        sq.draw();
        sq.draw("blue");

        Student student = new Student("Popescu", "11111111111111114",  PersonSex.MASCULIN, "12312441", "IT");
    }
}
