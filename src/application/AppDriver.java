package application;


import comparison.ShapeUtil;
import shapes.*;

public class AppDriver {

	public static void main(String[] args) {
		// args passed here to specify whether to sort by volume, base area, height etc

		// Testing Start
		ShapeUtil byArea = new ShapeUtil(1);
		ShapeUtil byVolume = new ShapeUtil(2);

		Shape[] array = byArea.readFile("res/polyfor1.txt");
		byArea.bubbleSort(array);
		for(int i = 0; i < 10; i++) {
			System.out.println(array[i].calcBaseArea());
		}
		// Testing End
	}
}
