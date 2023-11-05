package booksort;

import java.util.Scanner;

public class Database {

    Scanner scnr = new Scanner(System.in);
    
    public static void addBook(String name, String author, String genre, String ISBN, String popularity){
        Book book = new Book(name, author, genre, ISBN, popularity);
    }
    
    public static void addUser(String username, String contactInfo, String borrowedBooks){
        User user = new User(username, contactInfo, borrowedBooks);
    }
    
    public static void removeBook(String book){
        for (int i = 0; i < Sorting.bookList.size(); i++){
            if (Sorting.bookList.get(i)[0].equals(book)){
                Sorting.bookList.remove(i);
            }
        }
    }
    
    public static void removeUser(String user){
        for (int i = 0; i < Sorting.userList.size(); i++){
            if (Sorting.userList.get(i)[0].equals(user)){
                Sorting.userList.remove(i);
            }
        }
    }
    
    public static String[] retrieveBook(String book){
        String[] emptyBook = {"null", "null", "null", "null", "null"};
        for (int i = 0; i < Sorting.bookList.size(); i++){
            if (Sorting.bookList.get(i)[0] == book){
                return Sorting.bookList.get(i);
            }
        }
        return emptyBook;
    }
    
    public static String[] retrieveUser(String user) {
        String[] emptyUser = {"null", "null", "null"};
        for (int i = 0; i < Sorting.userList.size(); i++){
            if (Sorting.userList.get(i)[0] == user){
                return Sorting.userList.get(i);
            }
        }
        return emptyUser;
    }
    
    public static void updateBook(String title){
        for (int i = 0; i < Sorting.bookList.size(); i++){
            if (Sorting.bookList.get(i)[0] == title){
            }
        }
    }
    
    public static void updateUser(String user){
        for (int i = 0; i < Sorting.userList.size(); i++){
            if (Sorting.userList.get(i)[0] == user){
            }
        }
    }
}
