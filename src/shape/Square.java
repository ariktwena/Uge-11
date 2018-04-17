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
public class Square extends Shape {

    private final double height;

    private final double width;

    public Square(String color, double height, double width) {
        super(color);
        this.height = height;
        this.width = width;

    }

    @Override
    public double getCircumference() {
        double c = Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));
        double circumference = 2 * c;
        return circumference;
    }

    @Override
    public double getArea() {
        double area = height * width;
        return area;
    }

}
