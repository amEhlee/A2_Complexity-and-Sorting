package shapes;

public class Cylinder extends Shape implements Comparable {

    private double height;
    private double radius;

    public Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public double calcBaseArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public int compareTo(Object o) {
        Cylinder cylinder = (Cylinder) o;
        if (height > cylinder.height) return 1;
        else if (height < cylinder.height) return -1;
        else return 0;
    }
}
