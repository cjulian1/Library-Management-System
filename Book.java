public class Book
{
    private String title;
    private String author;
    private String category;
    private int ISBN; //ISBN gives interesting output

    public Book(String title, String author, String category, int ISBN)
    {
        this.title = title;
        this.author = author;
        this.category = category;
        this.ISBN = ISBN;
    }

    //Getter methods
    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public String getCategory(){
        return category;
    }

    public int getISBN(){
        return ISBN;
    }

    //Setter methods

    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setCategory(String category)
    {
        this.category = category;
    }

    public void setISBN(int ISBN)
    {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() //Incorrect format?
    {
        return ("Author: " + author + "\nTitle: " + title + "\nCategory: " + category + "\nISBN:" + ISBN);
    }
}
