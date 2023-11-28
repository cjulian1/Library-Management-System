package booksort;
import java.util.Scanner;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;


public class Booksort {
 
    public static void main(String[] args) {
        FlatMacLightLaf.setup();
        Scanner scnr = new Scanner(System.in);

        Database.addBook("Book1", "Author2", "Genre3", "123123123123", "true");
        Database.addBook("Book2", "Author3", "Genre1", "223123123123", "false");
        Database.addBook("Book3", "Author1", "Genre2", "323123123123", "false");
        
        Database.addUser("User1", "email2@website.com", "Book3");
        Database.addUser("User2", "email3@website.com", "Book1");
        Database.addUser("User3", "email1@website.com", "Book2");
        
        System.out.println("starting gui...");
        
        NewGUI gui = new NewGUI();
        gui.setVisible(true);
        //for(int i = 0; i < 100000; i++){
        //    System.out.println(i);
        //}
        //FlatMacLightLaf.setup();
        //com.formdev.flatlaf.FlatLaf.updateUI();
    }
    
}