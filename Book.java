package booksort;

public class Book {
    String title;
    String author;
    String genre;
    String ISBN;
    String availability;
    
    Book(String title, String author, String genre, String ISBN, String availability){
        if(!title.equalsIgnoreCase("null") && !title.equalsIgnoreCase("") && !author.equalsIgnoreCase("null") && !author.equalsIgnoreCase("") && !genre.equalsIgnoreCase("null") && !genre.equalsIgnoreCase("") && availability.matches("\\d+") && ISBN.matches("\\d+")){
            this.title = title;
            this.author = author;
            this.genre = genre;
            this.ISBN = ISBN;
            this.availability = availability;
            String[] properties = {"", "", "", "", ""};
            properties[0] = this.title;
            properties[1] = this.author;
            properties[2] = this.genre;
            properties[3] = this.ISBN;
            properties[4] = this.availability;
            Sorting.addBook(properties);
        }
    }
    
    public void setTitle(String newTitle){
        this.title = newTitle;
    }
    
    public void setAuthor(String newAuthor){
        this.author = newAuthor;
    }
    
    public void setGenre(String newGenre){
        this.genre = newGenre;
    }
    
    public void setISBN(String newISBN){
        this.author = newISBN;
    }
    
    public void setAvailability(String newAvailability){
        this.author = newAvailability;
    }
    
    public String getTitle(){
        return this.title;
    }
    
    public String getAuthor(){
        return this.author;
    }
    
    public String getGenre(){
        return this.genre;
    }
    
    public String getISBN(){
        return this.ISBN;
    }
    
    public String getAvailability(){
        return this.availability;
    }
}
