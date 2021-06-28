package testSorts;

import comparison.ShapeUtil;
import shapes.Shape;

public class TestBubbleSort {

    public static void main(String[] args) {
        // Testing Start
        ShapeUtil byHeight = new ShapeUtil(0);
        ShapeUtil byArea = new ShapeUtil(1);
        ShapeUtil byVolume = new ShapeUtil(2);
        long startTime = 0;
        long endTime = 0;


        Shape[] array = byArea.readFile("res/polyfor1.txt");

        startTime = System.currentTimeMillis();
        byHeight.bubbleSort(array);
        endTime = System.currentTimeMillis();
        System.out.println("\nBubble Sort by height:");
        for(int i = 0; i < array.length; i+=1000) {
            System.out.println("[" + i + "] " + array[i].getHeight());
        }
        System.out.println("[" + (array.length - 1) + "] " + array[(array.length - 1)].getHeight());
        System.out.println("-------------------------------------------");
        System.out.println("It took " + (endTime - startTime) + " ms.");

        startTime = System.currentTimeMillis();
        byArea.bubbleSort(array);
        endTime = System.currentTimeMillis();
        System.out.println("\nBubble Sort by base area:");
        for(int i = 0; i < array.length; i+=1000) {
            System.out.println("[" + i + "] " + array[i].calcBaseArea());
        }
        System.out.println("[" + (array.length - 1) + "] " + array[(array.length - 1)].calcBaseArea());
        System.out.println("-------------------------------------------");
        System.out.println("It took " + (endTime - startTime) + " ms.");

        startTime = System.currentTimeMillis();
        byVolume.bubbleSort(array);
        endTime = System.currentTimeMillis();
        System.out.println("\nBubble Sort by volume:");
        for(int i = 0; i < array.length; i+=1000) {
            System.out.println("[" + i + "] " + array[i].calcVolume());
        }
        System.out.println("[" + (array.length - 1) + "] " + array[(array.length - 1)].calcVolume());
        System.out.println("-------------------------------------------");
        System.out.println("It took " + (endTime - startTime) + " ms.");
        // Testing End
    }
}
