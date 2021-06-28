package testSorts;

import comparison.ShapeUtil;
import shapes.Shape;

public class TestQuickSort {
    public static void main(String[] args) {
        String filePath = "res/polyfor1.txt";
        Shape[] array1 = ShapeUtil.readFile(filePath);
        Shape[] array2 = ShapeUtil.readFile(filePath);
        Shape[] array3 = ShapeUtil.readFile(filePath);

        TestSort.runTest(array1, "Quick", "height");
        TestSort.runTest(array2, "Quick", "base area");
        TestSort.runTest(array3, "Quick", "volume");
    }
}
