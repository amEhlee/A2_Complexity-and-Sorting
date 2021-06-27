package comparison;

import shapes.*;

import java.util.Comparator;

public class ShapeUtil implements Comparator {
	private int sortType; // 1: base area, 2: volume

	public ShapeUtil(int sortType) {
		this.sortType = sortType;
	}

	@Override
	/**
	 * This compare method will be used to compare two shapes by base area / volume / height
	 * @param object1 - first shape to compare
	 * @param object2 - second shape to compare
	 */
	public int compare(Object object1, Object object2) {
		Shape shape1 = (Shape) object1;
		Shape shape2 = (Shape) object2;

		double shape1Size;
		double shape2Size;
		if (sortType == 1) {
			shape1Size = shape1.calcBaseArea();
			shape2Size = shape2.calcBaseArea();
		}
		else {
			shape1Size = shape1.calcVolume();
			shape2Size = shape2.calcVolume();
		}

		if (shape1Size > shape2Size) return 1;
		else if (shape1Size < shape2Size) return -1;
		else return 0;
	}

	public Shape[] sort(Shape[] before) {
		Shape[] after = null;
		//@todo after sorting

		return after;
	}
}
