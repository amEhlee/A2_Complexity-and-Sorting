package shapes;

public class TriangularPrism extends Prism {

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
}
