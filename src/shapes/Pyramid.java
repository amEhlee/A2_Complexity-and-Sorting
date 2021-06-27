package shapes;

public class Pyramid extends Shape {
	
	private double side;

	@Override
	public double calcVolume() {
		// TODO Auto-generated method stub
		return (side * side * height) / 3;
	}

	@Override
	public double calcBaseArea() {
		// TODO Auto-generated method stub
		return side * side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

}
