package shapes;

public class Pyramid extends Shape {

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
}
