public class Container {
    private int currentVolume;

    public Container() {
        this.currentVolume = 0;
    }

    public int getVolume() {
        return currentVolume;
    }

    public void add(int amount) {
        if (amount < 0) {
            amount = 0;
        }
        if (this.currentVolume + amount > 100) {
            this.currentVolume = 100;
        } else {
            this.currentVolume += amount;
        }
    }

    public void move(int amount, Container container) {
        if (this.currentVolume - amount < 0) {
            container.add(currentVolume);
            this.remove(currentVolume);
        } else {
            this.remove(amount);
            container.add(amount);
        }
    }

    public void remove(int amount) {
        if (amount < 0) {
            amount = 0;
        }
        if (this.currentVolume - amount < 0) {
            this.currentVolume = 0;
        } else {
            this.currentVolume -= amount;
        }
    }

    public int contains() {
        return this.currentVolume;
    }

    public String toString() {
        return currentVolume + "/100";
    }
}
