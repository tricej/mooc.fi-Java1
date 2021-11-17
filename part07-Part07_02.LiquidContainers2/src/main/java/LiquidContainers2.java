
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container containerA = new Container();
        Container containerB = new Container();

        while (true) {
            System.out.println("First: " + containerA.getVolume() + "/100");
            System.out.println("Second: " + containerB.getVolume() + "/100");
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            } if (input.split(" ")[0].equals("add")) {
                int addition = Integer.valueOf(input.split(" ")[1]);
                containerA.add(addition);
            } else if (input.split(" ")[0].equals("move")) {
                int moveAmount = Integer.valueOf(input.split(" ")[1]);
                containerA.move(moveAmount, containerB);
            } else if (input.split(" ")[0].equals("remove")) {
                int removeAmount = Integer.valueOf(input.split(" ")[1]);
                containerB.remove(removeAmount);
            }
        }
    }
}
