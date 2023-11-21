import java.util.ArrayList;

public class UpdateBooks implements SortBooks
{

    //Check out books
    public void checkOutBook(int ISBN)
    {
        for(Book book : books)
        {
            if(book.getISBN())
            {
                if(book.getAvailability() == true)
                {
                    book.setAvailability(false);
                    System.out.println("Book check out successful!");
                }
                else
                {
                    System.out.println("Book currently not available");
                }
                return;

            }
        }
        System.out.println("Book not found.");
    }

    //Return books
    public void returnBook(int ISBN)
    {
        for(Book book : books)
        {
            if(book.getISBN())
            {
                if(book.getAvailability() == false)
                {
                    book.setAvailability(true);
                    System.out.println("Book returned successfully!");
                }
                else
                {
                    System.out.println("Book is already checked in.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    //Show book availability
    public void bookAvailability(int ISBN, boolean availability)
    {
        for(Book book : books)
        {
            if(book.getISBN())
            {
                book.setAvailability(availability);
                System.out.println("Availability updated for: " + ISBN);
                return;
            }
        }
        System.out.println("Book not found.");
    }
}
