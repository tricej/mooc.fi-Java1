
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldestAge = 0;
        String oldestName = ""; 
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            if (oldestAge < Integer.valueOf(input.split(",")[1])) {
                oldestAge = Integer.valueOf(input.split(",")[1]);
                oldestName = input.split(",")[0];
            }
        }
        System.out.println("Name of the oldest: " + oldestName);        
    }
}
