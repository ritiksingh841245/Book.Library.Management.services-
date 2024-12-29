package Book.Library.Management.services;
import Book.Library.Management.System.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @since 24
 * @author Ritik Singh
 *
 */

public class UserService {
    private final List<User> users = new ArrayList<>();

    public void registerUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter user name: ");
        String name = scanner.nextLine();
        System.out.print("Enter user ID: ");
        String userId = scanner.nextLine();

        users.add(new User(name, userId));
        System.out.println("User registered successfully.");
    }
    public void View()
    {
        for (User u : users)
        {

            System.out.println(" "+u);
        }
    }
}
