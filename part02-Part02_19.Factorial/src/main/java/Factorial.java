
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int fact = Integer.valueOf(scanner.nextLine());
        int total = 1;
        for (int i = 1; i <= fact; i++) {
            total *= i;
        }
        System.out.println("Factorial: " + total);
    }
}
