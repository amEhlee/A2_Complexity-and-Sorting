package testSorts;

public class ArgWorker {

    public ArgWorker(String[] args) {
        argParser(args);
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

        // convert from char format to string
        compareType = convertCompare(compareType);
        sortType = convertSortType(sortType);

        System.out.println("COMPARE BY:" + compareType + "\nSORT BY:" + sortType);
		
        // create new object with update params
        TestSort t = new TestSort(file, compareType, sortType);
	}

    
    public static String convertSortType(String given){
        String result = "";
        switch (given.charAt(0)) {
    
            // convert sort types
            case 'b': result = "Bubble"; break;
            case 's': result = "Selection"; break;
            case 'i': result = "Insertion"; break;          
            case 'm': result = "Merge"; break;
            case 'q': result = "Quick"; break;
            case 'z': result = "Chosen"; break;
    
            default:
                System.out.printf("char %s is not any of the given sort types", given);
                break;
        }
    
        return result;
        
    }
    
    public static String convertCompare(String given) {
        String result = "";
        switch (given.charAt(0)) {
    
            // convert compare by's
            case 'v': result = "volume"; break;
            case 'a': result = "base"; break;
            case 'h': result = "height"; break;
    
            default:
                System.out.printf("char %s is not any of the given compare types", given);
                break;
        }
    
        return result;
    }
}

