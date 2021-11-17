
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(12);
        nums.add(-2);
        nums.add(6);
        nums.add(8);
        nums.add(5);
        
        System.out.println("The numbers in range [0, 5]");
        printNumbersInRange(nums, 0, 5);
        System.out.println("The numbers in range [3, 10]");
        printNumbersInRange(nums, 3, 10);
    }
    
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        for (int number : numbers) {
            if (number >= lowerLimit && number <= upperLimit) {
                System.out.println(number);
            }
        }
    }
    
}
