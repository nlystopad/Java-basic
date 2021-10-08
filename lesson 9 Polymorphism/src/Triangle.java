public class Triangle extends Geometry {
    protected double a;
    protected double b;
    protected double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double hp = (a + b + c) / 2; // halfPerimeter

    @Override
    public double getArea() {
        return Math.sqrt(hp * (hp - a) * (hp - b) * (hp - c)); //Формула Герона (использовал ее, а не формулу с высотой, потому что не мог определиться с количеством конструкторов для сторон и высоты)
    }

    @Override
    public double getPerimeter() {
        return hp * 2;
    }
}
