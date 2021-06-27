package comparison;

import shapes.Shape;

import java.util.Comparator;

public class ShapeUtil implements Comparator {
	private int sortType; // 0 (Default): height, 1: base area, 2: volume

	public ShapeUtil(int sortType) {
		this.sortType = sortType;
	}

	@Override
	/**
	 * This compare method will be used to compare two shapes by base area / volume / height
	 * @param o1 - first shape to compare
	 * @param o2 - second shape to compare
	 */
	public int compare(Object o1, Object o2) {
		long o1Size = 0;
		long o2Size = 0;
		if (sortType == 1) {
			o1Size = o1.calcBaseArea();
			o2Size = o2.calcBaseArea();
		} else if (sortType == 2) {
			o1Size = o1.calcVolume();
			o2Size = o2.calcVolume();
		} else {
			o1Size = o1.getHeight();
			o2Size = o2.getHeight();
		}

		if(o1Size > o2Size) return 1;
		else (o2Size < o1Size) return -1;
		else return 0;
	}

	public Shape[] sort(Shape[] before) {
		Shape[] after = null;
		//@todo after sorting

		return after;
	}
}
