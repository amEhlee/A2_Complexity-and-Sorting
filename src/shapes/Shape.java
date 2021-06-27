package shapes;

public abstract class Shape {

    private double height;

    public abstract double calcBaseArea();
    public abstract double calcVolume();

    public abstract double getHeight();

    public abstract void setHeight( double height);

}
