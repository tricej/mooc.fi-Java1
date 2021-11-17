
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(2);
        nums.add(6);
        nums.add(-1);
        
        System.out.println(sum(nums));
        
        nums.add(5);
        nums.add(1);
        System.out.println(sum(nums));
    }
    
    public static int sum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

}
