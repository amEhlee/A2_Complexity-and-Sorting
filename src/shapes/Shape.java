package shapes;

/**
 * GeometricShape
 * Represents 3 dimensional geometric shapes
 * 
 */
public abstract class Shape {
	// Attributes
    protected double height;
    
    // Abstract methods
    public abstract double calcVolume();
    public abstract double calcBaseArea();
    
    // Getters 
	public double getHeight() {
		return height;
	}
	
	// Setters
	public void setHeight(double height) {
		this.height = height;
	}
}