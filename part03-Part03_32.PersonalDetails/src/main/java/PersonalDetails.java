
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> years = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            names.add(input.split(",")[0]);
            years.add(Integer.valueOf(input.split(",")[1]));
        }
        String longestName = "";
        for (String name : names) {
            if (longestName.length() < name.length()) {
                longestName = name;
            }
        }
        int sum = 0;
        for (int year : years) {
            sum += year;
        }
        System.out.println("Longest Name: " + longestName);
        System.out.println("Average of the birth years: " + 1.0 * sum / years.size());

    }
}
