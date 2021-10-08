public class Square extends Rectangle {

    public Square(double a) {
        super(a);
    }

    public double getArea() {
        return Math.pow(a, 2);
    }

    public double getPerimeter() {
        return a * 4;
    }

    @Override
    public void draw() {
        super.draw();
    }
}
