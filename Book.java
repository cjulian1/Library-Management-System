package booksort;

public class Book {
    String title;
    String author;
    String genre;
    String ISBN;
    String availability;
    int ID = 0;
    
    Book(String title, String author, String genre, String ISBN, String availability){
        if(!title.equalsIgnoreCase("null") && !title.equalsIgnoreCase("") && !author.equalsIgnoreCase("null") && !author.equalsIgnoreCase("") && !genre.equalsIgnoreCase("null") && !genre.equalsIgnoreCase("") && (availability.matches("true") || availability.matches("false")) && ISBN.matches("\\d+")){
            this.title = title;
            this.author = author;
            this.genre = genre;
            this.ISBN = ISBN;
            this.availability = availability;
            this.ID = Sorting.ID;
            Sorting.ID++;
            String[] properties = {"", "", "", "", "", ""};
            properties[0] = this.title;
            properties[1] = this.author;
            properties[2] = this.genre;
            properties[3] = this.ISBN;
            properties[4] = this.availability;
            properties[5] = Integer.toString(this.ID);
            Sorting.addBook(properties);
        }
    }
    
    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public String getGenre(){
        return genre;
    }

    public String getISBN(){
        return ISBN;
    }

    public String getAvailability(){return availability;}

    //Setter methods

    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setGenre(String genre)
    {
        this.genre = genre;
    }

    public void setISBN(String ISBN)
    {
        this.ISBN = ISBN;
    }
    
    public void setAvailability(String ISBN)
    {
        this.ISBN = ISBN;
    }
}
