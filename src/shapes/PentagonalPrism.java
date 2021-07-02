package shapes;

public class PentagonalPrism extends Prism implements Comparable {

    private double height;
    private double side;

    public PentagonalPrism(double height, double side) {
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
        return (5 * Math.pow(side, 2) * Math.tan(Math.toRadians(54))) / 4;
    }

    @Override
    public double calcVolume() {
        return this.calcBaseArea() * height;
    }

    @Override
    public int compareTo(Object o) {
        Shape shape = (Shape) o;
        if (height > shape.getHeight()) return 1;
        else if (height < shape.getHeight()) return -1;
        else return 0;
    }

    /**
     * Overidden toString method to return a string representation of the object
     * @return String representation of the object
     */
    @Override
    public String toString() {
        return "PentagonalPrism{" +
                "height=" + height +
                ", side=" + side +
                '}';
    }
}
