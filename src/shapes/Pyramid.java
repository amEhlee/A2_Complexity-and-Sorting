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
        Pyramid pyramid = (Pyramid) o;
        if (height > pyramid.height) return 1;
        else if (height < pyramid.height) return -1;
        else return 0;
    }
}
