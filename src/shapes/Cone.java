package shapes;

public class Cone extends GeometricShape {
	
	private double radius;

	@Override
	public double calcVolume() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(radius, 2) * height / 3;
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
