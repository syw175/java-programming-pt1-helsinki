public class Timer {
    private ClockHand hundredths;
    private ClockHand seconds;

    public Timer() {
        this.hundredths = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }

    public void advance() {
        hundredths.advance();
        if (hundredths.value() == 00) {
            seconds.advance();
        }
    }

    public String toString() {
        return (seconds.toString() + ":" + hundredths.toString());
    }
}
