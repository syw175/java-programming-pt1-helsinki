public class Container {

    private int volume;

    public Container() {
        this.volume = 0;
    }

    public boolean validInput(int num) {
        return num >= 0;
    }

    public int contains() {
        return this.volume;
    }

    public void add(int toAdd) {
        if (toAdd >= 0 && validInput(toAdd)) {
            this.volume += toAdd;
        }
        if (this.volume > 100) {
            this.volume = 100;
        }
    }


    public void remove(int toRemove) {
        if (toRemove > this.volume && validInput(toRemove)) {
            this.volume -= this.volume;
        }
        else if (toRemove <= this.volume) {
            this.volume -= toRemove;
        }
        if (this.volume < 0) {
            this.volume = 0;
        }
    }

    @Override
    public String toString() {
        return this.volume + "/100";
    }
}
