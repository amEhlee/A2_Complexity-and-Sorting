package testSorts;

import comparison.ShapeUtil;
import shapes.Shape;

/**
 * This class sorts an array in a specific way and shows the time it took.
 *
 * @author Don Laliberte
 * @author Elie Kabengele
 * @author Jared Smith
 * @author Jaekyung Jeon
 * @version June 30th, 2021
 * */
public class TestSort {

    /**
     * sorts an array in a specific way and shows the time it took.
     * @param array array to be sorted
     * @param algorithm which algorithm to use
     * @param sort by base area/height/volume
     */
    public static void runTest(Shape[] array, String algorithm, String sort) {
        long startTime;
        long endTime;
        ShapeUtil shapeutil;

        if(sort.equals("height")) {
            shapeutil = new ShapeUtil(0);
        } else if(sort.equals("volume")) {
            shapeutil = new ShapeUtil(2);
        } else if (sort.equals("base area")) {
            shapeutil = new ShapeUtil(1);
        } else {
            // default to height
            shapeutil = new ShapeUtil(0);
        }

        startTime = System.currentTimeMillis();
        switch (algorithm) {
            case "Bubble" : shapeutil.bubbleSort(array); break;
            case "Selection" : shapeutil.selectionSort(array); break;
            case "Insertion" : shapeutil.insertionSort(array); break;
            case "Merge" : shapeutil.mergeSort(array, 0, array.length - 1); break;
            case "Quick" : shapeutil.quickSort(array, 0, array.length - 1); break;
            case "Heap" : shapeutil.heapSort(array); break;
            default: algorithm = "Quick"; shapeutil.quickSort(array, 0, array.length - 1); break;
        }
        endTime = System.currentTimeMillis();
        System.out.println("\n" + algorithm +" Sort by " + sort + ":");

        // depending the type, uses different method for calculation
        if(sort.equals("height")) {
            // uses getHeight()
            for(int i = 0; i < array.length; i+=1000) {
                System.out.println("[" + i + "] " + array[i].getHeight());
            }
            System.out.println("[" + (array.length - 1) + "] " + array[(array.length - 1)].getHeight());
        } else if(sort.equals("volume")) {
            // uses calcVolume()
            for(int i = 0; i < array.length; i+=1000) {
                System.out.println("[" + i + "] " + array[i].calcVolume());
            }
            System.out.println("[" + (array.length - 1) + "] " + array[(array.length - 1)].calcVolume());
        } else {
            // uses calcBaseArea()
            for(int i = 0; i < array.length; i+=1000) {
                System.out.println("[" + i + "] " + array[i].calcBaseArea());
            }
            System.out.println("[" + (array.length - 1) + "] " + array[(array.length - 1)].calcBaseArea());
        }

        System.out.println("-------------------------------------------");
        System.out.println("It took " + (endTime - startTime) + " ms.");
    }



}
