package booksort;

import java.util.ArrayList;

public class Sorting implements Sortable {
    
    public static Boolean sortHighToLow = false;
    
    public static ArrayList<String[]> bookList = new ArrayList<>();     // Create String ArrayList for each book to be put into
    public static ArrayList<String[]> userList = new ArrayList<>();     // Create String ArrayList for each user to be put into
    ArrayList<String> propertyArray = new ArrayList<String>();
    ArrayList<String> nameArray = new ArrayList<String>();
    
    public static void addBook(String[] bookProperties){                // Adds book to sortable book list
        bookList.add(bookProperties);
    }
    
    public static void addUser(String[] bookProperties){                // Adds user to sortable user list
        userList.add(bookProperties);
    }

    @Override
    public String[] sortTitle() {                                       // Prepares titles to be sorted with bubble sort
        propertyArray.clear();
        nameArray.clear();
        for(int i=0; i<bookList.size(); i++){
            propertyArray.add(bookList.get(i)[0]);
            nameArray.add(bookList.get(i)[0]);
        }
        
        ArrayList<String> tmpStringPropertyArray = new ArrayList();
        String[] fixedPropertyArray = new String[propertyArray.size()];
        String[] fixedNameArray = new String[nameArray.size()];
        
        fixedNameArray = ArrayListConvert.toStringArray(nameArray);
        fixedPropertyArray = ArrayListConvert.toStringArray(propertyArray);
        
        if(sortHighToLow){
            String[] tmpStrArr = new String[nameArray.size()];
            int h = -1;
            fixedNameArray = BubbleSort.sortString(fixedNameArray, fixedPropertyArray);
            
            for(int i = fixedNameArray.length - 1; i >= 0; i--){
                h++;
                tmpStrArr[h] = fixedNameArray[i];
            }
            return tmpStrArr;
        }
        return BubbleSort.sortString(fixedNameArray, fixedPropertyArray);
    }

    @Override
    public String[] sortAuthor() {                                      // Prepares authors to be sorted with bubble sort
        propertyArray.clear();
        nameArray.clear();
        for(int i=0; i<bookList.size(); i++){
            propertyArray.add(bookList.get(i)[1]);
            nameArray.add(bookList.get(i)[0]);
        }
        
        ArrayList<String> tmpStringPropertyArray = new ArrayList();
        String[] fixedPropertyArray = new String[propertyArray.size()];
        String[] fixedNameArray = new String[nameArray.size()];
        
        fixedNameArray = ArrayListConvert.toStringArray(nameArray);
        fixedPropertyArray = ArrayListConvert.toStringArray(propertyArray);
        
        if(sortHighToLow){
            String[] tmpStrArr = new String[nameArray.size()];
            int h = -1;
            fixedNameArray = BubbleSort.sortString(fixedNameArray, fixedPropertyArray);
            
            for(int i = fixedNameArray.length - 1; i >= 0; i--){
                h++;
                tmpStrArr[h] = fixedNameArray[i];
            }
            return tmpStrArr;
        }
        
        return BubbleSort.sortString(fixedNameArray, fixedPropertyArray);
    }

    @Override
    public String[] sortGenre() {                                       // Prepares genres to be sorted with bubble sort
        propertyArray.clear();
        nameArray.clear();
        for(int i=0; i<bookList.size(); i++){
            propertyArray.add(bookList.get(i)[2]);
            nameArray.add(bookList.get(i)[0]);
        }
        
        ArrayList<String> tmpStringPropertyArray = new ArrayList();
        String[] fixedPropertyArray = new String[propertyArray.size()];
        String[] fixedNameArray = new String[nameArray.size()];
        
        fixedNameArray = ArrayListConvert.toStringArray(nameArray);
        fixedPropertyArray = ArrayListConvert.toStringArray(propertyArray);
        
        if(sortHighToLow){
            String[] tmpStrArr = new String[nameArray.size()];
            int h = -1;
            fixedNameArray = BubbleSort.sortString(fixedNameArray, fixedPropertyArray);
            
            for(int i = fixedNameArray.length - 1; i >= 0; i--){
                h++;
                tmpStrArr[h] = fixedNameArray[i];
            }
            return tmpStrArr;
        }
        
        return BubbleSort.sortString(fixedNameArray, fixedPropertyArray);
    }

    @Override
    public String[] sortISBN() {                                        // Prepares ISBNs to be sorted with bubble sort
        propertyArray.clear();
        nameArray.clear();
        for(int i=0; i<bookList.size(); i++){
            propertyArray.add(bookList.get(i)[3]);
            nameArray.add(bookList.get(i)[0]);
        }
        
        long[] fixedPropertyArray = new long[propertyArray.size()];
        String[] fixedNameArray = new String[nameArray.size()];
        
        fixedPropertyArray = ArrayListConvert.toLongArray(propertyArray);
        fixedNameArray = ArrayListConvert.toStringArray(nameArray);
        
        if(sortHighToLow){
            String[] tmpStrArr = new String[nameArray.size()];
            int h = -1;
            fixedNameArray = BubbleSort.sortLong(fixedNameArray, fixedPropertyArray);
            
            for(int i = fixedNameArray.length - 1; i >= 0; i--){
                h++;
                tmpStrArr[h] = fixedNameArray[i];
            }
            return tmpStrArr;
        }
        
        return BubbleSort.sortLong(fixedNameArray, fixedPropertyArray);
    }
    
    @Override
    public String[] sortAvailability(){                                         // Prepares availabilitys to be sorted with bubble sort
        propertyArray.clear();
        nameArray.clear();
        for(int i=0; i<bookList.size(); i++){
            propertyArray.add(bookList.get(i)[4]);
            nameArray.add(bookList.get(i)[0]);
        }
        
        int[] fixedPropertyArray = new int[propertyArray.size()];
        String[] fixedNameArray = new String[nameArray.size()];
        fixedPropertyArray = ArrayListConvert.toIntArray(propertyArray);
        fixedNameArray = ArrayListConvert.toStringArray(nameArray);

        if(sortHighToLow){
            String[] tmpStrArr = new String[nameArray.size()];
            int h = -1;
            fixedNameArray = BubbleSort.sort(fixedNameArray, fixedPropertyArray);
            
            for(int i = fixedNameArray.length - 1; i >= 0; i--){
                h++;
                tmpStrArr[h] = fixedNameArray[i];
            }
            return tmpStrArr;
        }
        
        return BubbleSort.sort(fixedNameArray, fixedPropertyArray);
    }
    
    @Override
    public String[] sortUsers() {                                       // Prepares users to be sorted with bubble sort
        propertyArray.clear();
        nameArray.clear();
        for(int i=0; i<userList.size(); i++){
            propertyArray.add(userList.get(i)[0]);
            nameArray.add(userList.get(i)[0]);
        }
        
        ArrayList<String> tmpStringPropertyArray = new ArrayList();
        String[] fixedPropertyArray = new String[propertyArray.size()];
        String[] fixedNameArray = new String[nameArray.size()];
        
        fixedNameArray = ArrayListConvert.toStringArray(nameArray);
        fixedPropertyArray = ArrayListConvert.toStringArray(propertyArray);
        
        if(sortHighToLow){
            String[] tmpStrArr = new String[nameArray.size()];
            int h = -1;
            fixedNameArray = BubbleSort.sortString(fixedNameArray, fixedPropertyArray);
            
            for(int i = fixedNameArray.length - 1; i >= 0; i--){
                h++;
                tmpStrArr[h] = fixedNameArray[i];
            }
            return tmpStrArr;
        }
        
        return BubbleSort.sortString(fixedNameArray, fixedPropertyArray);
    }
    
    public static void setBookProperties(String bookTitle, String title, String author, String genre, String ISBN, String availability){      // Changes book properties in sortable list
        String[] newArr = {title, author, genre, ISBN, availability};
        for(int i=0; i<bookList.size(); i++){
            if(bookList.get(i)[0].equalsIgnoreCase(bookTitle)){
                bookList.set(i, newArr);
            }
        }
    }
    
    public static void setUserProperties(String user, String username, String contactInfo, String borrowedBooks){      // Changes user properties in sortable list
        String[] newArr = {username, contactInfo, borrowedBooks};
        for(int i=0; i<userList.size(); i++){
            if(userList.get(i)[0].equalsIgnoreCase(user)){
                userList.set(i, newArr);
            }
        }
    }
    
    public static void sortHighToLow(String setHTL){
        if(setHTL.equalsIgnoreCase("true")){
            sortHighToLow = true;
        } else {
            sortHighToLow = false;
        }
    }
}