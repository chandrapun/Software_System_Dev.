package lab1;


public class driver {

    public static void main(String[] args) {
        // Test Rectangle
        Rectangle rectangle = new Rectangle(6, 6);
        System.out.println(rectangle.toString());

        // Test Circle
        Circle circle = new Circle(6);
        System.out.println(circle.toString());

        // Test Ellipse
        Ellipse ellipse = new Ellipse(4, 2);
        System.out.println(ellipse.toString());

        // Additional ellipses
        Ellipse ellipse2 = new Ellipse(6, 3);
        System.out.println(ellipse2.toString());
    }
}