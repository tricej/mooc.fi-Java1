import java.util.ArrayList;

public class Package {
    
    private ArrayList<Gift> giftList;

    public Package() {
        this.giftList = new ArrayList<Gift>();
    }

    public void addGift(Gift gift) {
        this.giftList.add(gift);
    }

    public int totalWeight() {
        int sumWeight = 0;
        for (Gift gift : this.giftList) {
            sumWeight += gift.getWeight();
        }
        return sumWeight;
    }


}
