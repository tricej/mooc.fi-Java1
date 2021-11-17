
import java.util.Scanner;

public class Message {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
      
        // Declare message and assign user input to variable.
        String message = scanner.nextLine();
        
        System.out.println(message);

    }
}
