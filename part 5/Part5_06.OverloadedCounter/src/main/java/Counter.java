public class Counter {
    private int value;

    public Counter(int value) {
        this.value = value;
    }

    public Counter() {
        this.value = 0;
    }

    public int value() { return this.value; }
    public void increase(int increment) {
        if (increment >= 0) {
            this.value += increment;
        }
    }

    public void increase() {
        this.increase(1);
    }

    public void decrease(int decrement) {
        if (decrement >= 0) {
            this.value -= decrement;
        }
    }

    public void decrease() {
        this.decrease(1);
    }
}
