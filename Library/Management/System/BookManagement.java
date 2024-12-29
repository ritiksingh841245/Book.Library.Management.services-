package Book.Library.Management.System;


import Book.Library.Management.services.BookService;

/**
 * @since 24
 * @author Riitk Singh
 * Book Management:
 *
 * Add new books.
 * Remove books.
 * Search books by title, author, or ISBN
 */

public class BookManagement {

    private String title;
    private String author;
    private String ISBN;
    private  boolean isAvailable ;
    BookService bs = new BookService();

   public BookManagement(String title, String author, String ISBN)
    {
        this.title       = title;
        this.author      = author;
        this.ISBN        = ISBN;
    }
    public String getTitle()
    {
        return title;
    }
    public String getAuthor()
    {
        return author;
    }
    public String getISBN()
    {
        return ISBN;
    }
    public boolean getIsAvailable()
    {
        return isAvailable;
    }
    public boolean SetIsAvailable(boolean isAvailable)
    {
        this.isAvailable = isAvailable;
        return this.isAvailable;
    }
    public String toString()
    {

        return  "Book{" +
                "  title         = " + title + "\'" +
                "  author      = " + author + "\'" +
                "  isbn        = '" + ISBN + "\'" +
                "  isAvailable = " + isAvailable +
                "}";
    }






}
