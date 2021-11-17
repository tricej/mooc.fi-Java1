import java.lang.ProcessBuilder.Redirect;

public class Fitbyte {
    private int age;
    private int restingHeartRate;


    public Fitbyte(int age, int restingHeartRate) {
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }

    public double targetHeartRate(double percentageOfMaxiumum) {
        return (((206.3 - (0.711 * age)) - restingHeartRate) * percentageOfMaxiumum) + restingHeartRate;
    }
}
