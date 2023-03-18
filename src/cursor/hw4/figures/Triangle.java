package cursor.hw4.figures;

import cursor.hw4.general.Shape;

public class Triangle extends Shape {

    private double c;
    private double h;

    public Triangle(double x, double y, double c, double h) {
        super(x, y);
        this.c = c;
        this.h = h;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double getPerimeter() {
        return getA() + getB() + getC();
    }

    @Override
    public double getArea() {
        return 0.5 * getC() * getH();
    }

    @Override
    public String toString() {
        return "Triangle sides length and height: " + super.toString() + " c = " + c + ", h = " + h;
    }
}
