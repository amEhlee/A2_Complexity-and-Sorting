package shapes;

/**
 * Abstract class for all the shapes
 *
 * @author Don Laliberte
 * @author Elie Kabengele
 * @author Jared Smith
 * @author Jaekyung Jeon
 * @version June 30th, 2021
 */
public abstract class Shape implements Comparable {

    private double height;

    /**
     * Calculates the base area of the shape and return the value
     * @return Calculated base area
     */
    public abstract double calcBaseArea();

    /**
     * Calculates the volume of the shape and return the value
     * @return Calculated volume
     */
    public abstract double calcVolume();

    /**
     * Sets the height of the shape
     * @param height height to be set as
     */
    public abstract void setHeight(double height);

    /**
     * Gets the height of the shape
     * @return height of the shape
     */
    public abstract double getHeight();

}
