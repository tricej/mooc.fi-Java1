
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double count = 0;
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 0) {
                if (sum == 0) {
                    System.out.println("Cannot calculate the average");
                    break;
                } else {
                    System.out.println(sum / count);
                    break;
                }
            } else if (input > 0) {
                sum += input;
                count += 1;
            }
            continue;
        }
    }
}
