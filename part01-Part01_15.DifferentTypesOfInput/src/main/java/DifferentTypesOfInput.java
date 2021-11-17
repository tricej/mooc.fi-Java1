
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String stringMessage = scan.nextLine();
        
        System.out.println("Give an integer:");
        int intMessage = Integer.valueOf(scan.nextLine());
        
        System.out.println("Give a double:");
        double doubleMessage = Double.valueOf(scan.nextLine());
        
        System.out.println("Give a boolean:");
        boolean boolMessage = Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string " + stringMessage);
        System.out.println("You gave the integer " + intMessage);
        System.out.println("You gave the double " + doubleMessage);
        System.out.println("You gave the boolean " + boolMessage);
    }
}
