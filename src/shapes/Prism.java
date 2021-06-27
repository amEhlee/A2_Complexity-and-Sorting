package shapes;

public abstract class Prism extends Shape implements Comparable {

    private double height;
    private double side;

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public void setHeight(double height) {
        this.height = height;
    }

}
