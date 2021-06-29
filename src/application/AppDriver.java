package application;


import comparison.ShapeUtil;
import testSorts.TestSort;
import shapes.*;


public class AppDriver {



	public static void main(String[] args) {
		// args passed here to specify whether to sort by volume, base area, height etc
		TestSort t = new TestSort(args);
	}
}
