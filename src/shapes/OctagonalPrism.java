package shapes;

public class OctagonalPrism extends Prism {

    private double height;
    private double side;

    public OctagonalPrism(double height, double side) {
        this.height = height;
        this.side = side;
    }

    public double getHeight() {
        return height;
    }

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
        return 2 * (1 + Math.sqrt(2)) * Math.pow(side, 2);
    }

    @Override
    public double calcVolume() {
        return this.calcBaseArea() * height;
    }
}
