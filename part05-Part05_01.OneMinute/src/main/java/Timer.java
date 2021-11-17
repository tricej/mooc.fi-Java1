public class Timer {
    private ClockHand hundredths;
    private ClockHand seconds;

    public Timer() {
        hundredths = new ClockHand(100);
        seconds = new ClockHand(60);
    }

    public void advance() {
        this.hundredths.advance();
        if (this.hundredths.value() == 00) {
            this.seconds.advance();
        }

    }

    public String toString() {
        return this.seconds + ":" + this.hundredths;
    }
}
