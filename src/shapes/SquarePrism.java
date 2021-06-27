package shapes;

public class SquarePrism extends Prism{

    private double height;
    private double side;

    public SquarePrism(double height, double side) {
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
        return Math.pow(side, 2);
    }

    @Override
    public double calcVolume() {
        return Math.pow(side, 2) * height;
    }
}
