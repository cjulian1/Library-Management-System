package booksort;

public class BubbleSort{
    public static String[] sort(String[] nameArray, int[] propertyArray){    // Sorts an array of Integers using bubble sort
        Boolean sorted = false;
        int propTemp1;
        int propTemp2;
        String nameTemp1;
        String nameTemp2;
        for(int h=0; h<propertyArray.length || !sorted; h++){
            sorted = true;
            for(int i=0; i<propertyArray.length - 1; i++){
                if (propertyArray[i] > propertyArray[i + 1]){
                    propTemp1 = propertyArray[i];
                    propTemp2 = propertyArray[i+1];
                    nameTemp1 = nameArray[i];
                    nameTemp2 = nameArray[i+1];
                    propertyArray[i] = propTemp2;
                    propertyArray[i+1] = propTemp1;
                    nameArray[i] = nameTemp2;
                    nameArray[i+1] = nameTemp1;
                    sorted = false;
                    
                }
            
            }
        }
        return nameArray;
    }
    
    public static String[] sortString(String[] nameArray, String[] propertyArray){    // Sorts an array of Strings using bubble sort
        Boolean sorted = false;
        String propTemp1;
        String propTemp2;
        String nameTemp1;
        String nameTemp2;
        for(int h=0; h<propertyArray.length || !sorted; h++){
            sorted = true;
            for(int i=0; i<propertyArray.length - 1; i++){
                if (propertyArray[i].compareToIgnoreCase(propertyArray[i + 1]) > 0){
                    propTemp1 = propertyArray[i];
                    propTemp2 = propertyArray[i+1];
                    nameTemp1 = nameArray[i];
                    nameTemp2 = nameArray[i+1];
                    propertyArray[i] = propTemp2;
                    propertyArray[i+1] = propTemp1;
                    nameArray[i] = nameTemp2;
                    nameArray[i+1] = nameTemp1;
                    sorted = false;
                }
            
            }
        }
        return nameArray;
    }
    
    public static String[] sortLong(String[] nameArray, long[] propertyArray){    // Sorts an array of Longs using bubble sort
        Boolean sorted = false;
        long propTemp1;
        long propTemp2;
        String nameTemp1;
        String nameTemp2;
        for(int h=0; h<propertyArray.length || !sorted; h++){
            sorted = true;
            for(int i=0; i<propertyArray.length - 1; i++){
                if (propertyArray[i] > propertyArray[i + 1]){
                    propTemp1 = propertyArray[i];
                    propTemp2 = propertyArray[i+1];
                    nameTemp1 = nameArray[i];
                    nameTemp2 = nameArray[i+1];
                    propertyArray[i] = propTemp2;
                    propertyArray[i+1] = propTemp1;
                    nameArray[i] = nameTemp2;
                    nameArray[i+1] = nameTemp1;
                    sorted = false;
                    
                }
            
            }
        }
        return nameArray;
    }
}
