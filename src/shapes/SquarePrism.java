package shapes;

public class SquarePrism extends Prism implements Comparable {

    private double height;
    private double side;

    public SquarePrism(double height, double side) {
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
    public double calcBaseArea() {
        return Math.pow(side, 2);
    }

    @Override
    public double calcVolume() {
        return Math.pow(side, 2) * height;
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
        return "SquarePrism{" +
                "height=" + height +
                ", side=" + side +
                '}';
    }
}
