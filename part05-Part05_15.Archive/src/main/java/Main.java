
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();
        ArrayList<Item> printList = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String itemId = scanner.nextLine();
            if (itemId.isEmpty()) {
                break;
            }
            System.out.println("Name? (empty will stop");
            String itemName = scanner.nextLine();
            if (itemName.isEmpty()) {
                break;
            }
            Item item = new Item(itemName, itemId);
            items.add(item);
            if (!(printList.contains(item))) {
                printList.add(item);
            }
        }
        
        for (Item item : printList) {
            System.out.println(item.toString());
        }
    }
}
