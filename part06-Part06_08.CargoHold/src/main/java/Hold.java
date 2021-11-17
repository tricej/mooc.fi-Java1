import java.util.ArrayList; 

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> holdContents;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.holdContents = new ArrayList<>();
    }

    public void addSuitcase (Suitcase suitcase) {
        if (this.getWeight() + suitcase.totalWeight() <= maxWeight) {
            this.holdContents.add(suitcase);
        }
    }

    public int getWeight() {
        int sumWeight = 0;
        for (Suitcase suitcase : this.holdContents) {
            sumWeight += suitcase.totalWeight();
        }
        return sumWeight;
    }

    public void printItems() {
        for (Suitcase suitcase : holdContents) {
            suitcase.printItems();
        }
    }

    public String toString() {
        return this.holdContents.size() + " suitcases (" + this.getWeight() + " kg)";
    }
}
