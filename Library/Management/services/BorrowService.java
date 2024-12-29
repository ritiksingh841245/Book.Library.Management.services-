package Book.Library.Management.services;

import Book.Library.Management.System.BorrowRecord;

import java.util.*;

public class BorrowService {
    private final List<BorrowRecord> borrowServices = new ArrayList<>();

    public void borrowBook()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter user ID: ");
        String userId = scanner.nextLine();
        System.out.print("Enter ISBN of the book to borrow: ");
        String isbn = scanner.nextLine();
        Date borrowDate = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(borrowDate);
        calendar.add(Calendar.DAY_OF_MONTH, 14); // 2 weeks loan period
        Date dueDate = calendar.getTime();

        borrowServices.add(new BorrowRecord(isbn,userId,borrowDate,dueDate));
        System.out.println("Book borrowed successfully. Due date: " + dueDate);
    }
    public void returnBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ISBN of the book to return: ");
        String isbn = scanner.nextLine();


        borrowServices.removeIf(record -> record.getIsbn().equals(isbn));
        System.out.println("Book returned successfully.");
    }
    public void viewReports() {
        System.out.println("Borrowed Books Report:");
        borrowServices.forEach(System.out::println);
    }

}
