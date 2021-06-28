package testSorts;

import comparison.ShapeUtil;
import shapes.Shape;

public class TestSort {

    public TestSort(String[] args) {
        argParser(args);
    }

    public TestSort(String infile, String compareBy, String sortType) {
        Shape[] givenArray = ShapeUtil.readFile(infile);

        // convert from char format to string
        compareBy = convertCompare(compareBy);
        sortType = convertSortType(sortType);

        runTest(givenArray, sortType, compareBy);
    }

    protected static void runTest(Shape[] array, String algorithm, String sort) {
        long startTime;
        long endTime;
        ShapeUtil shapeutil;

        if(sort.equals("height")) {
            shapeutil = new ShapeUtil(0);
        } else if(sort.equals("volume")) {
            shapeutil = new ShapeUtil(2);
        } else if (sort.equals("base")) {
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

    public static void argParser(String[] args) {
		String file = "", 
			   sortType = "", 
			   compareType = "";
  
		for (String a : args) {
  
		   switch (Character.toLowerCase(a.charAt(0))) {
			  case 'f':
				 file = a.substring(1);
				 break;
			  case 's':
				 sortType = String.valueOf(Character.toLowerCase(a.charAt(1)));
				 break;
			  case 't':
				 compareType = String.valueOf(Character.toLowerCase(a.charAt(1)));
				 break;
		   
			  default:
				 System.out.printf("argument %s cannot be read \n", Character.toLowerCase(a.charAt(0)));
				 break;
		   }
		   
		}
		
        // create new object with update params
        TestSort t = new TestSort(file, compareType, sortType);
	}

    public static String convertSortType(String given){
        switch (given) {

            // convert sort types
            case "b": given = "Bubble";
            case "s": given = "Selection";
            case "i": given = "Insertion";           
            case "m": given = "Merge";
            case "q": given = "Quick";
            case "z": given = "Chosen";

            default:
                System.out.println("char is not any of the given sort types");
                break;
        }

        return given;
        
    }

    public static String convertCompare(String given) {
        switch (given) {

            // convert compare by's
            case "v": given = "volume";
            case "a": given = "base";
            case "h": given = "height";

            default:
                System.out.println("char is not any of the given compare types");
                break;
        }

        return given;
    }

}
