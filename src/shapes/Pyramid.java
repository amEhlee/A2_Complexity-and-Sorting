package shapes;

public class Pyramid extends Shape implements Comparable {

    private double height;
    private double side;

    public Pyramid(double height, double side) {
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
        return (Math.pow(side, 2) * height) / 3;
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
        return "Pyramid{" +
                "height=" + height +
                ", side=" + side +
                '}';
    }
}
