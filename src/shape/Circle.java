/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author Tweny
 */
public class Circle extends Shape {

    private double radius;
    private double pi = Math.PI;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;

    }

    @Override
    public double getCircumference() {
        double circumference = 2 * pi * radius;
        return circumference;
    }

    @Override
    public double getArea() {
        double area = pi * Math.pow(radius, 2);
        return area;
    }

}
