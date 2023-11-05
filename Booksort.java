package booksort;
import java.util.Scanner;

public class Booksort {
 
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        Database.addBook("Book1", "Author2", "Genre3", "123123123123", "0");
        Database.addBook("Book2", "Author3", "Genre1", "223123123123", "1");
        Database.addBook("Book3", "Author1", "Genre2", "323123123123", "1");
        
        Database.addUser("User1", "email2@website.com", "Book3");
        Database.addUser("User2", "email3@website.com", "Book1");
        Database.addUser("User3", "email1@website.com", "Book2");
        
        GUI gui = new GUI();
    }
    
}