import java.util.ArrayList;
import java.util.Locale;

public class SortBooks
{
    //using ArrayList
    private ArrayList<Book> books;

    public SortBooks()
    {
        books = new ArrayList<>();
    }

    public void addBook(Book book)
    {
        books.add(book);
        System.out.println(book.getTitle() + " added successfully!");
    }
    public void removeBook(int ISBN)
    {
        boolean found = false;
        for(Book book : books)
        {
            if(book.getISBN() == ISBN)
            {
                books.remove(book);
                System.out.println(book.getTitle() + " removed successfully");
                found = true;
                break;
            }
        }
        if(!found)
        {
            System.out.println("Book not found");
        }
    }

    public void searchBook(String keyword)
    {
        System.out.println("Results for: " + keyword);
        for(Book book : books)
        {
            if(book.getTitle().toLowerCase().contains(keyword.toLowerCase()) || book.getAuthor().toLowerCase().contains(keyword.toLowerCase()));
            {
                System.out.println(book);
            }
        }
    }

    //Sort by title

    //sort by author

    //sort by category

    //sort by ISBN
}
