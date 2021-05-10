package Task1;

public class Square extends Figure {

    protected int a;
    protected int b;
    protected int c;
    protected int d;

    public Square(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public double perimetr() {
        return a * 4;
    }

    @Override
    public double square() {
        return a * b;
    }
}
