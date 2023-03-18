package cursor.hw4.general;

public abstract class Shape implements PerimeterMeasurable, AreaMeasurable {
    private double a;
    private double b;


    public Shape(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }


    @Override
    public String toString() {
        return "a = " + a + ", b = " + b;
    }
}
