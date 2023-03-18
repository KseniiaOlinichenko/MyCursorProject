package cursor.hw4.figures;

import cursor.hw4.general.Shape;

public class Trapezoid extends Shape {
    private double c;
    private double d;
    private double h;

    public Trapezoid(double a, double b, double c, double d, double h) {
        super(a, b);
        this.c = c;
        this.d = d;
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

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    @Override
    public double getArea() {
        return 0.5 * (getA() + getB()) * getH();
    }

    @Override
    public double getPerimeter() {
        return getA() + getB() + getC() +getD();
    }

    @Override
    public String toString() {
        return "Trapezoid sides length and height " + super.toString() + " c = " + c + ", d = " + d + ", h = " + h;
    }
}
