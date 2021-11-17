
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Initialize sum and count variables
        int sum = 0;
        double count = 0;
        // Start infinite loop
        while (true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 0) {
                System.out.println("Average of the numbers: " + (sum / count));
                break;
            }
            sum += input;
            count += 1;
        }
    }
}
