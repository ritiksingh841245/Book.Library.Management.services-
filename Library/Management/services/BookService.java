package Book.Library.Management.services;

import Book.Library.Management.System.BookManagement;

import java.util.*;

/**
 * @since  24
 * @author Ritik Singh
 * BookService for all book-related operations.
 */

public class BookService {
    private List<BookManagement> books = new ArrayList<>() ;
    public void addBook()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter book title ");
        String title  = sc.nextLine();
        System.out.println("Enter auther Name ");
        String auther = sc.nextLine();
        System.out.println("Enter ISBN");
        String isbn   = sc.nextLine();
        books.add(new BookManagement(title,auther,isbn));
        System.out.println("Book added successfully.");

    }
    public void removeBook() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ISBN of the book to remove: ");
        String isbn = scanner.nextLine();

        books.removeIf(bookManagement -> bookManagement.getISBN().equals(isbn));
        System.out.println("Book removed successfully.");


    }
    public void searchBook() {
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter title or author to search: ");
        String query = scanner.nextLine().toLowerCase();

        /*books.stream()
                .filter(book -> book.getTitle().toLowerCase().contains(query) || book.getAuthor().toLowerCase().contains(query))
                .forEach(System.out::println);*/
        for (BookManagement book : books) {
            String title = book.getTitle().toLowerCase();
            String author = book.getAuthor().toLowerCase();
            if (title.contains(query.toLowerCase()) || author.contains(query.toLowerCase())) {
                System.out.println(book);
                i++;
            }

        }
        if (i==0)
        {
            System.out.println("Book is Not Available");
        }

    }


    }




