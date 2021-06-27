package shapes;

public abstract class Shape {

    private double height;

    abstract double calcBaseArea();
    abstract double calcVolume();

    abstract double getHeight();

    abstract void setHeight( double height);

}
