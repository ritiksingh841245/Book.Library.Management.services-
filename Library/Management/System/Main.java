package Book.Library.Management.System;

import Book.Library.Management.services.BookService;
import Book.Library.Management.services.BorrowService;
import Book.Library.Management.services.UserService;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final BookService bookService = new BookService();
    private static final UserService userService = new UserService();
    private static final BorrowService borrowService = new BorrowService();


    public static void main(String[] args) {
        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book");
            System.out.println("4. Register User");
            System.out.println("5. Borrow Book");
            System.out.println("6. Return Book");
            System.out.println("7. View Reports");
            System.out.println("8. View User");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            try {
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1 -> bookService.addBook();
                    case 2 -> bookService.removeBook();
                    case 3 -> bookService.searchBook();
                    case 4 -> userService.registerUser();
                    case 5 -> borrowService.borrowBook();
                    case 6 -> borrowService.returnBook();
                    case 7 -> borrowService.viewReports();
                    case 8 -> userService.View();
                    case 9 -> {
                        System.out.println("Exiting system. Goodbye!");
                        return;
                    }
                    default -> System.out.println("Invalid choice. Please try again.");
                }
            }
            catch (Exception e)
            {
                System.out.println("Invalid choice. Please choice Number ");
                scanner.nextLine();

            }

        }


    }
}
