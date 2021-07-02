package shapes;

public class OctagonalPrism extends Prism implements Comparable {

    private double height;
    private double side;

    /**
     * Default Constructor for OctogonalPrism. Sets up defined height and side
     * @param height
     * @param side
     */
    public OctagonalPrism(double height, double side) {
        this.height = height;
        this.side = side;
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

    /** Getter for Side 
     * @return return Side
     */
    public double getSide() {
        return side;
    }

    /** Setter for Side
     *  @param Side to set 
    */
    public void setSide(double side) {
        this.side = side;
    }

    /**
     * Calculates the base area of the OctogonalPrism based on defined sides
     * @return base area to return
     */
    @Override
    public double calcBaseArea() {
        return 2 * (1 + Math.sqrt(2)) * Math.pow(side, 2);
    }

    /**
     * Calculates the volume of OctogonalPrism based on defined height
     * @return volume to return
    */
    @Override
    public double calcVolume() {
        return this.calcBaseArea() * height;
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
        return "OctagonalPrism{" +
                "height=" + height +
                ", side=" + side +
                '}';
    }
}
