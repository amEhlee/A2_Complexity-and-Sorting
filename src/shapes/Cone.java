package shapes;

/**
 * Class Description: Class for the "Cone" Shape containing all its base getters and setters. When we loop through the input files
 * this shape's objects will be created and stored
 * 
 * @author Don Laliberte
 * @author Elie Kabengele
 * @author Jared Smith
 * @author Jaekyung Jeon
 * @version June 30th, 2021
 */
public class Cone extends Shape implements Comparable {
    private double height;
    private double radius;

    /**
     * Default Constructor for Cone. Sets up defined height and radius
     * @param height
     * @param radius
     */
    public Cone(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    /** Getter for Height
     * @return returns height
     */
    @Override
    public double getHeight() {
        return height;
    }

    /** Setter for Height
     *  @param height to set 
    */
    @Override
    public void setHeight(double height) {
        this.height = height;
    }
    
    /** Getter for Radius 
     * @return return Radius
     */
    public double getRadius() {
        return radius;
    }

    /** Setter for Radius
     *  @param Radius to set 
    */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Calculates the volume of Cone based on defined radius and height
     * @return volume to return
     */
    @Override
    public double calcVolume() {
        return (Math.PI * Math.pow(radius, 2) * height) / 3;
    }

    /**
     * Calculates the base area of the Cone based on defined radius
     * @return base area to return
     */
    @Override
    public double calcBaseArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    /**
     * Overidden compareTo method to compare similar objects by height.
     * @param o object to compare with 
     */
    @Override
    public int compareTo(Object o) {
        Shape shape = (Shape) o;
        if (height > shape.getHeight()) return 1;
        else if (height < shape.getHeight()) return -1;
        else return 0;
    }

    /**
     * Overidden toString method to return a string representation of the object
     * @return String representation of the object
     */
    @Override
    public String toString() {
        return "Cone{" +
                "height=" + height +
                ", radius=" + radius +
                '}';
    }
}
