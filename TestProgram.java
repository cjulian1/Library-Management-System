import java.util.Scanner;

public class TestProgram
{
    public static void main(String[] args)
    {
        SortBooks sort = new SortBooks();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while(choice != 4)
        {
            System.out.println("Library Managment System");
            System.out.println("1. Add a book");
            System.out.println("2. Remove a book");
            System.out.println("3. Search for a book");
            System.out.println("4. Exit");
            choice = scanner.nextInt();
            scanner.nextLine();

            if(choice == 1)
            {
                System.out.println("Enter book title: ");
                String title = scanner.nextLine();
                System.out.println("Enter author: ");
                String author = scanner.nextLine();
                System.out.println("Enter category: ");
                String category = scanner.nextLine();
                System.out.println("Enter ISBN");
                int ISBN = scanner.nextInt();
                sort.addBook(new Book(title, author, category, ISBN));
            } else if(choice == 2)
            {
                System.out.println("Enter ISBN of book to remove: ");
                int removeISBN = scanner.nextInt();
                scanner.nextLine();
                sort.removeBook(removeISBN);
            }else if(choice == 3)
            {
                while(choice != 5)
                {
                    System.out.println("Search by: ");
                    System.out.println("1. Title");
                    System.out.println("2. Author");
                    System.out.println("3. Genre");
                    System.out.println("4. ISBN");
                    System.out.println("5. Back");
                    choice = scanner.nextInt();
                    scanner.nextLine();

                    if(choice == 1)
                    {
                        System.out.println("Enter Book Title: ");
                    }
                    if(choice == 2)
                    {
                        System.out.println("Enter Author: ");
                    }
                    if(choice == 3)
                    {
                        System.out.println("Enter Genre: ");
                    }
                    if(choice == 4)
                    {
                        System.out.println("Enter ISBN: ");
                    }
                    if(choice == 5)
                    {
                        //Go back to the beginning
                    }
                }
            }else if(choice == 4)
            {
                System.out.println("Successfully Logged Out!");
            }else
            {
                System.out.println("Invalid choice. Please choose one of the provided options");
            }
        }
        scanner.close();


        /*Book book1 = new Book("title1", "author1","fiction",0123456);

        System.out.println(book1);; //ISBN gives interesting output

        //Use the sorting methods*/
    }
}

/*Notes
System should allow for the librarian to keep track of book data
Users should be able to check out books
Librarian should be able to update book information

Create an arraylist to sort through the books:
Need to be able to sort through all the different categories

Things that this should do:
-Add books
-Remove books
-search books
-sort books
 */