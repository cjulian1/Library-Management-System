package booksort;

public class User {
    String username;
    String contactInfo;
    String borrowedBooks;
    
    User(String username, String contactInfo, String borrowedBooks){
        if(!username.equalsIgnoreCase("null") && !username.equalsIgnoreCase("") && !contactInfo.equalsIgnoreCase("null") && !contactInfo.equalsIgnoreCase("") && !borrowedBooks.equalsIgnoreCase("null") && !borrowedBooks.equalsIgnoreCase("")){
            this.username = username;
            this.contactInfo = contactInfo;
            this.borrowedBooks = borrowedBooks;
            String[] properties = {"", "", "", "", ""};
            properties[0] = this.username;
            properties[1] = this.contactInfo;
            properties[2] = this.borrowedBooks;
            Sorting.addUser(properties);
        }
    }
    
    public void setUsername(String newUsername){
        this.username = newUsername;
    }
    
    public void setContactInfo(String newContactInfo){
        this.contactInfo = newContactInfo;
    }
    
    public void setBorrowedBooks(String newBorrowedBooks){
        this.borrowedBooks = newBorrowedBooks;
    }
    
    public void setLength(String newLength){
        this.contactInfo = newLength;
    }
    
    public void setPopularity(String newPopularity){
        this.contactInfo = newPopularity;
    }
    
    public String getUsername(){
        return this.username;
    }
    
    public String getContactInfo(){
        return this.contactInfo;
    }
    
    public String getBorrowedBooks(){
        return this.borrowedBooks;
    }
}
