import java.util.ArrayList;

public class Suitcase {
    private int weight;
    private int maxWeight;
    private ArrayList<Item> contents;

    public Suitcase(int maxWeight) {
        this.contents = new ArrayList<Item>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item){
        int sumWeight = this.totalWeight();
        if (sumWeight + item.getWeight() <= maxWeight) {
            this.contents.add(item);
        }
    }

    public void printItems() {
        for (Item item : this.contents) {
            System.out.println(item.getName() + " (" + item.getWeight() + " kg)");
        }

    }

    public int totalWeight() {
        int sumWeight = 0;
        for (Item item : this.contents) {
            sumWeight += item.getWeight();
        }
        return sumWeight;
    }

    public Item heaviestItem() {
        if (this.contents.isEmpty()) {
            return null;
        } 
        Item compareItem = this.contents.get(0);
        for (Item item : this.contents) {
            if (item.getWeight() > compareItem.getWeight()) {
                compareItem = item;
            }
        }
        return compareItem;

    }

    public String toString() {
        int sumWeight = this.totalWeight();
        if (this.contents.size() == 0) {
            return "no items (0kg)";
        } else if (this.contents.size() == 1) {
            return "1 item (" + sumWeight + " kg)";
        }
        return this.contents.size() + "items (" + sumWeight + " kg)";  
    }
}
