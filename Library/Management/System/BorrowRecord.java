package Book.Library.Management.System;
import java.util.Date;

/**
 * @since 24
 * @author Ritik Singh
 * BorrowRecord to track book, user, and due date.
 */
public class BorrowRecord {

    private String isbn;
    private String userId;
    private Date borrowDate;
    private Date dueDate;

    public BorrowRecord(String isbn, String userid, Date borrowDate,Date dueDate)
    {
        this.isbn       = isbn;
        this.userId     = userid;
        this.borrowDate = borrowDate;
        this.dueDate    = dueDate;
    }
    public String getIsbn()
    {
        return isbn;
    }
    public String getUserId()
    {
        return userId;
    }
    public Date getBorrowDate()
    {
        return borrowDate;
    }
    public Date getDueDate()
    {
        return dueDate;
    }
    public String toString()
    {
        return "isbn        = "+isbn+"\""+
                "userId     = "+userId+"\'"+
                "borrowDate = "+borrowDate+"\""+
                "DueDate    = "+dueDate+'\"';
    }

}
