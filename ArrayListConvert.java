package booksort;

import java.util.ArrayList;

public class ArrayListConvert {
    
    public static String[] toStringArray(ArrayList<String> oldArrayList){        // Converts ArrayList to String array
        String[] newArray = new String[oldArrayList.size()];         // Creates string array that's the same length as the ArrayList            
        for (int i = 0; i < oldArrayList.size(); i++){               // Adds each string in the ArrayList to the new String array
            newArray[i] = oldArrayList.get(i);                                        
        }                                                                            
        return newArray;                                                            
    }                                                                                
                                                                                        
    public static int[] toIntArray(ArrayList<String> oldArrayList){              // Converts ArrayList to Int array
        int[] newArray = new int[oldArrayList.size()];               // Creates Int array that's the same length as the ArrayList                      
        String tmp = "";                                             // Resets tmp for when the function is rerun               
        for (int i = 0; i < oldArrayList.size(); i++){               // Adds each Int in the ArrayList to the new Int array                 
            tmp = oldArrayList.get(i);                                                    
            newArray[i] = Integer.valueOf(tmp);                                            
        }                                                                                
        return newArray;                                                                    
    }                                                                                    
                                                                                                
    public static long[] toLongArray(ArrayList<String> oldArrayList){            // Converts ArrayList to Long array        
        long[] newArray = new long[oldArrayList.size()];             // Creates Long array that's the same length as the ArrayList        
        String tmp = "";                                             // Resets tmp for when the function is rerun             
        for (int i = 0; i < oldArrayList.size(); i++){               // Adds each Long in the ArrayList to the new Long array                      
            tmp = oldArrayList.get(i);
            newArray[i] = Long.valueOf(tmp);
        }
        return newArray;
    }
}
