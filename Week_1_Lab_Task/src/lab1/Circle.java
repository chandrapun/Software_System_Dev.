package lab1;

//Circle class extends the Shape class
public class Circle extends Shape {

 // Constructor for Circle that takes an integer radius
 Circle(int radius) {
     // Calls the constructor of the parent class (Shape) with 0 sides, 
     // as a circle has no sides
     super(0);
     
     // Assign the radius value to the instance variable
     this.radius = radius;
     // TODO: You can add additional logic here if needed in the future
 }

 // Private field to store the radius of the circle
 private int radius;

 // Getter method to return the radius of the circle
 public int getRadius() {
     return radius;
 }

 // Setter method to modify the radius of the circle
 public void setRadius(int radius) {
     this.radius = radius;
 }
 
 // Override the getArea method from Shape class
 // Calculates and returns the area of the circle using the formula: π * radius^2
 @Override
 public double getArea() {
     return Math.PI * Math.pow(radius, 2);
 }

 // Override the toString method to return a string representation of the Circle object
 // Includes the radius, area, and number of sides
 @Override
 public String toString() {
     return "Circle [radius=" + radius + ", getArea()=" + getArea() + ", getSides()=" + getSides() + "]";
 }
 
}
