package application;

import testSorts.TestSort;

/**
 * Class description: Smaller class used a bridge between appdriver and testSort classes. It reformats the provided command line arguments 
 * so we can use them for later. 
 *
 * @author Don Laliberte
 * @author Elie Kabengele
 * @author Jared Smith
 * @author Jaekyung Jeon
 * @version June 30th 2021
 */
public class ArgWorker {

    /**
     * ArgWorker Constructor just takes in arguments and runs the parser method
     * @param args provided command line arguments
     */
    public ArgWorker(String[] args) {
        argParser(args);
    }

    /**
     * checks the given command line arguments for a txtfile, sortType and compareType
     * @param args provided command line arguments
     */
    public static void argParser(String[] args) {
        
        // default values incase nothing is given through args
    	int index = 1;
		String file = "polyfor1.txt", 
			   sortType = "q", 
			   compareType = "a";
		
		// check if correct number of arguments was added
        if(args.length < 3) {
        	System.out.println("ERROR: Invalid number of arguments please enter one valid filename, compare type and sort type");
        	System.exit(0);
        	return;
        }
        
  
		for (String a : args) {

            // change the index we check if the given argument includes a - sign or not (shifts charAt index)
            int checkindex;
            if(a.charAt(0) == '-')
                checkindex = 2;
            else 
                checkindex = 1;
            
 
            switch (Character.toLowerCase(a.charAt(checkindex - 1))) {
                case 'f':
                    file = a.substring(checkindex);
                    break;
                case 's':
                    sortType = String.valueOf(Character.toLowerCase(a.charAt(checkindex)));
                    break;
                case 't':
                    compareType = String.valueOf(Character.toLowerCase(a.charAt(checkindex)));
                    break;
            
                default:
                    System.out.printf("argument %s cannot be read. Preset defaults will be used in its place \n", index);
            }
            
            index ++;
		   
		}

        // convert from char format to string
        compareType = convertCompare(compareType);
        sortType = convertSortType(sortType);

        // error checking 
        System.out.printf("\nCOMPARE BY: %s\nSORT BY: %s\nFILE: %s\n", compareType, sortType, file);
		
        // create new object with updated params
        TestSort t = new TestSort(file, compareType, sortType);
	}

    /**
     * This method is just to convert the sortType to its expanded name e.g sortType 'b' to 'Bubble'
     * since args only specifies the character to represent a sort
     * @param given the starting character that was given
     * @return returns the expanded sort name to be used later in checking sortType
     */
    public static String convertSortType(String given){
        String result = "";
        switch (given.charAt(0)) {
    
            // convert sort types
            case 'b': result = "Bubble"; break;
            case 's': result = "Selection"; break;
            case 'i': result = "Insertion"; break;          
            case 'm': result = "Merge"; break;
            case 'q': result = "Quick"; break;
            case 'z': result = "Heap"; break;
    
            // default case which does nothing
            default:
            	result = "Bubble";
                System.out.printf("char %s is not any of the given sort types. Preset Defaults will be used instead\n", given);
                break;
        }
    
        return result;
        
    }
    
    /**
     * Quick method that turns a given compareType to its expanded form to later be used in testSort
     * @param given the character we want to convert to expanded form
     * @return returns the expanded form of the given character
     */
    public static String convertCompare(String given) {
        String result = "";
        switch (given.charAt(0)) {
    
            // convert compare by's
            case 'v': result = "volume"; break;
            case 'a': result = "base area"; break;
            case 'h': result = "height"; break;
    
            default:
            	result = "base area";
                System.out.printf("char %s is not any of the given compare types. Preset Defaukts will be used instead\n", given);
                break;
        }
    
        return result;
    }
}

