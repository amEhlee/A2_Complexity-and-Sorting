package application;


import comparison.ShapeUtil;
import shapes.*;

public class AppDriver {

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
  
		// doing something like this will auto run the method runTest in TestSort 
		// TestSort t = new TestSort(array, file, compareType, sortType);
	}

	public static void main(String[] args) {
		// args passed here to specify whether to sort by volume, base area, height etc

	}
}
