package booksort;

import java.util.ArrayList;

public class ArrayListConvert {
    
    public static String[] toStringArray(ArrayList<String> oldArrayList){
        String[] newArray = new String[oldArrayList.size()];
        for (int i = 0; i < oldArrayList.size(); i++){
            newArray[i] = oldArrayList.get(i);
        }
        return newArray;
    }
    
    public static int[] toIntArray(ArrayList<String> oldArrayList){
        int[] newArray = new int[oldArrayList.size()];
        String tmp = "";
        for (int i = 0; i < oldArrayList.size(); i++){
            tmp = oldArrayList.get(i);
            newArray[i] = Integer.valueOf(tmp);
        }
        return newArray;
    }
    
    public static long[] toLongArray(ArrayList<String> oldArrayList){
        long[] newArray = new long[oldArrayList.size()];
        String tmp = "";
        for (int i = 0; i < oldArrayList.size(); i++){
            tmp = oldArrayList.get(i);
            newArray[i] = Long.valueOf(tmp);
        }
        return newArray;
    }
}
