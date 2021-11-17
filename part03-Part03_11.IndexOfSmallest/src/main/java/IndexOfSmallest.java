
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> indicies = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }
            list.add(input);
        }
        System.out.println(list);
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        int smallest = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (smallest > list.get(i)) {
                smallest = list.get(i);
                indicies.add(i);
                System.out.println(i);
            }
        }
        System.out.println("Smallest number: " + smallest);
        for (int j = 0; j < indicies.size(); j++) {
            System.out.println("Found at index: " + indicies.get(j));
        }  
    }
}
