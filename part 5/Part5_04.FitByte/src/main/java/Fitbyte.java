public class Fitbyte {
    private int age;
    private int restingRate;

    public Fitbyte(int age, int restingRate) {
        this.age = age;
        this.restingRate = restingRate;
    }

    public double getMaxHeartRate() {
        return 206.3 - (0.711 * this.age);
    }

    public double targetHeartRate(double percentHeartRate) {
      return (getMaxHeartRate() - this.restingRate) * percentHeartRate + this.restingRate;
    }
}
