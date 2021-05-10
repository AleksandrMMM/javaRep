package Task1;

public class Circle extends Figure{
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double perimetr() {

        return 2 *  Math.PI * radius;
    }

    @Override
    public double square() {
        return 2 * Math.PI * radius ;
    }
}
