
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String user1 = "alex";
        String user1Pass = "sunshine";
        String user2 = "emma";
        String user2Pass = "haskell";
        
        System.out.println("Enter username:");
        String username = scanner.nextLine();
        System.out.println("Enter password:");
        String password = scanner.nextLine();
        
        if (username.equals(user1) && password.equals(user1Pass)) {
            System.out.println("You have successfully logged in!");
        } else if (username.equals(user2) && password.equals(user2Pass)) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
