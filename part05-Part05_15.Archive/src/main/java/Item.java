public class Item {
    private String itemName;
    private String itemId;

    public Item(String itemName, String itemId) {
        this.itemName = itemName;
        this.itemId = itemId;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Item)) {
            return false;
        }

        Item comparedItem = (Item) compared;

        if (this.itemId.equals(comparedItem.itemId)
        ) {
            return true;
        }

        return false;
    }

    public String toString() {
        return this.itemId + ": " + this.itemName;
    }
}
