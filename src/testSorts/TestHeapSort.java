package testSorts;

import comparison.ShapeUtil;
import shapes.Shape;

public class TestHeapSort {
    public static void main(String[] args) {
    	
    	String filePath ="res/polyfor1.txt";
    	Shape[] array1 = ShapeUtil.readFile(filePath);
    	Shape[] array2 = ShapeUtil.readFile(filePath);
    	Shape[] array3 = ShapeUtil.readFile(filePath);

		ShapeUtil.sort(array1, "Heap", "height");
		ShapeUtil.sort(array2, "Heap", "base area");
		ShapeUtil.sort(array3, "Heap", "volume");
    
    }
}
