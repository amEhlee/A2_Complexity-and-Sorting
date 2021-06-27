package application;


import comparison.ShapeUtil;
import shapes.*;

public class AppDriver {

	public static void main(String[] args) {
		// args passed here to specify whether to sort by volume, base area, height etc
		ShapeUtil shapeUtil = new ShapeUtil(0);
		SquarePrism shapeOne = new SquarePrism(24.0, 18.0);
		SquarePrism shapeTwo = new SquarePrism(14.0, 16.0);
		System.out.println(shapeUtil.compare(shapeOne,shapeTwo));
	}

}
