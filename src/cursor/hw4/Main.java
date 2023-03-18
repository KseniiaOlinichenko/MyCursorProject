package cursor.hw4;

import cursor.hw4.figures.Rectangle;
import cursor.hw4.figures.Trapezoid;
import cursor.hw4.figures.Triangle;

public class Main {
    public static void main(String[] args) {

        System.out.println("For better understanding I simplified the task. But there is a plus, it will be easier to check :)");
        System.out.println("----------------------------------------------------");

        System.out.println("Triangle's Data.");
        Triangle triangle = new Triangle(5,7,9, 6);
        System.out.println(triangle);
        System.out.println("Perimeter of the Triangle = " + triangle.getPerimeter());
        System.out.println("Area of the Triangle = " + triangle.getArea());

        System.out.println("----------------------------------------------------");
        System.out.println("Rectangle's Data.");
        Rectangle rectangle = new Rectangle(6.5, 10.7);
        System.out.println(rectangle);
        System.out.println("Perimeter of the Rectangle = " + rectangle.getPerimeter());
        System.out.println("Area of the Rectangle = " + rectangle.getArea());

        System.out.println("----------------------------------------------------");
        System.out.println("Trapezoid's Data.");
        Trapezoid trapezoid = new Trapezoid(4.2, 5.8, 3.3, 9.7,6.1);
        System.out.println(trapezoid);
        System.out.println("Perimeter of the Trapezoid = " + trapezoid.getPerimeter());
        System.out.println("Area of the Trapezoid = " + trapezoid.getArea());

    }
}
