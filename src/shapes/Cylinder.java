package shapes;

public class Cylinder extends Shape {
	
	private double radius;

	@Override
	public double calcVolume() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(radius, 2) * height;
	}

	@Override
	public double calcBaseArea() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(radius, 2);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
}
