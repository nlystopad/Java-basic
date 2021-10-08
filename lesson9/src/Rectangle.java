public class Rectangle extends Geometry {

    protected double a;
    protected double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Rectangle(double a) {
        this.a = a;
    }

    @Override
    public double getArea() {
        return a * b;
    }


    public double getPerimeter() {
        return (a + b) * 2;
    }

    @Override
    public void draw() {

    }
}
