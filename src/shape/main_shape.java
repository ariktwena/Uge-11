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
public class main_shape {

    public static void main(String[] args) {
          Shape shape1 = new Square("Blue", 10, 20);
          Shape shape2 = new Triangle("Blue", 10, 20);
          Shape shape3 = new Circle("Blue", 20);
          
          System.out.println("Farve: " + shape1.getColor() + " Cirkel omkreds: " + shape1.getCircumference() +   " Areal: "  + shape1.getArea());
          System.out.println("Farve: " + shape2.getColor() + " Cirkel omkreds: " + shape2.getCircumference() +   " Areal: "  + shape2.getArea());
          System.out.println("Farve: " + shape3.getColor() + " Cirkel omkreds: " + shape3.getCircumference() +   " Areal: "  + shape3.getArea());
          
          
          if (shape1 instanceof Shape){ //man indersøger om shape 1 arver fra shape, Hvis ja, så udskrives følgende
            System.out.println("Farve: " + shape1.getColor());  
          }
          
          //Shape shape3 = new Shape(); //Man kan ikke oprette noget der bare er en shape, da man også skal lave omkredser osv 
          
    }

}
