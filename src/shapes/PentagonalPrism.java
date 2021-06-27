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
        PentagonalPrism pentagonalPrism = (PentagonalPrism) o;
        if (height > pentagonalPrism.height) return 1;
        else if (height < pentagonalPrism.height) return -1;
        else return 0;
    }
}
