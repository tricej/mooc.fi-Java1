public class Bird {
    private String commonName;
    private String latinName;
    private int observations;

    public Bird(String commonName, String latinName) {
        this.commonName = commonName;
        this.latinName = latinName;
    }

    public void Observation() {
        this.observations++;
    }

    public String getCommonName() {
        return this.commonName;
    }

    public String toString() {
        return this.commonName + " (" + this.latinName + ") " + this.observations + " observations";
    }


}
