package cursor.hw4.figures;

import cursor.hw4.general.Shape;

public class Rectangle extends Shape {
    public Rectangle(double a, double b) {
        super(a, b);
    }

    @Override
    public double getPerimeter() {
        return 2 * (getA() + getB());
    }

    @Override
    public double getArea() {
        return getA() * getB();
    }
    public String toString(){
        return "Rectangle sides length " + super.toString();
    }
}
