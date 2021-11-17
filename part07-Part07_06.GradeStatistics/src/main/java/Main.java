
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        gradeList grades = new gradeList();
        
        
        System.out.println("Enter point totals, -1 stops:");
        // Start infinite loop to gather input
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            if (input >= 0 && input <= 100) {
                grades.addPoints(input);
            }
        }
        scanner.close();

        // Print output
        System.out.println("Point average (all): " + grades.averagePointsAll());
        System.out.println("Point average (passing): " + grades.averagePointsPassing());
        System.out.println("Pass percentage: " + grades.passPercentage());
        grades.printGradeDistribution();
    }
}
