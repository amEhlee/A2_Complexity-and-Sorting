package shapes;

public class PentagonalPrism extends Prism implements Comparable {

    private double height;
    private double side;

    /**
     * Default Constructor for PentagonalPrism. Sets up defined height and side
     * @param height
     * @param side
     */
    public PentagonalPrism(double height, double side) {
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
     * Calculates the base area of the PentagonalPrism based on defined sides
     * @return base area to return
     */
    @Override
    public double calcBaseArea() {
        return (5 * Math.pow(side, 2) * Math.tan(Math.toRadians(54))) / 4;
    }

    /**
     * Calculates the volume of PentagonalPrism based on defined height
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
        return "PentagonalPrism{" +
                "height=" + height +
                ", side=" + side +
                '}';
    }
}
