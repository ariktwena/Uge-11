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
public abstract class Shape {

    private String color;

    public Shape(String color) {
        this.color = color;

    }

    public String getColor() {
        return color;
    }

    public abstract double getCircumference();

    public abstract double getArea();

}
