
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Initialize count and sum variables
        int count = 0;
        int sum = 0;
        // Start infinite loop
        while (true) {
            // Prompt for input and save input to variable
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());
            // If input equals 0, display results and break.
            if (input == 0) {
                System.out.println("Number of numbers: " + count);
                System.out.println("Sum of the numbers: " + sum);
                break;
            }
            // Sum and continue count.
            sum += input;
            count += 1;
        }
    }
}
