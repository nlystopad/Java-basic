public class Parallelogram extends Rectangle {

    protected double h;

    public Parallelogram(double a, double b, double h) {
        super(a, b);
        this.h = h;
    }

    /**
     * a, b - sides
     * h - height
     */

    @Override
    public double getArea() {
        return a * h / 2;
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter(); // Так как периметр параллелограмма равен 2 * ( a + b ), то нет смысла переопределять метод
    }
}
