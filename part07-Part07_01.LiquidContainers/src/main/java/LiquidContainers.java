
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int containerA = 0;
        int containerB = 0;

        while (true) {
            System.out.println("First: " + containerA + "/100");
            System.out.println("Second: " + containerB + "/100");
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            } if (input.split(" ")[0].equals("add")) {
                int addition = Integer.valueOf(input.split(" ")[1]);
                if (addition < 0) {
                    continue;
                }     
                if (containerA + addition > 100) {
                    containerA = 100;
                } else {
                    containerA += addition;
                }
            } else if (input.split(" ")[0].equals("move")) {
                int moveAmount = Integer.valueOf(input.split(" ")[1]);
                if (moveAmount < 0) {
                    continue;
                }
                if (containerA - moveAmount < 0) {
                    if (containerB + containerA > 100) {
                        containerB = 100;
                        containerA = 0;
                    } else {
                        containerB += containerA;
                        containerA = 0;
                    }
                } else {
                    if (containerB + moveAmount > 100) {
                        containerA -= moveAmount;
                        containerB = 100;
                    } else {
                        containerA -= moveAmount;
                        containerB += moveAmount;
                    }
                }
            } else if (input.split(" ")[0].equals("remove")) {
                int removeAmount = Integer.valueOf(input.split(" ")[1]);
                if (removeAmount < 0) {
                    continue;
                }
                if (containerB - removeAmount < 0) {
                    containerB = 0;
                } else {
                    containerB -= removeAmount;
                }
            }
        }
    }

}
