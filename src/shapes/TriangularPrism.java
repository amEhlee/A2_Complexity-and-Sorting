package shapes;

public class TriangularPrism extends Prism implements Comparable {

    private double height;
    private double side;

    public TriangularPrism(double height, double side) {
        this.height = height;
        this.side = side;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public void setHeight(double height) {
        this.height = height;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double calcVolume() {
        return this.calcBaseArea() * height;
    }

    @Override
    public double calcBaseArea() {
        return (Math.pow(side, 2) * Math.sqrt(3)) / 4;
    }

    @Override
    public int compareTo(Object o) {
        Shape shape = (Shape) o;
        if (height > shape.getHeight()) return 1;
        else if (height < shape.getHeight()) return -1;
        else return 0;
    }

    @Override
    public String toString() {
        return "TriangularPrism{" +
                "height=" + height +
                ", side=" + side +
                '}';
    }
}
