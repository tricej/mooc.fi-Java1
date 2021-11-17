
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What file should have its contents printed?");
        String input = scanner.nextLine();
        try (Scanner filescan = new Scanner(Paths.get(input))) {
            
            while (filescan.hasNextLine()) {
                String row = filescan.nextLine();
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
