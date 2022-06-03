import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> hold;
    private int currWeight;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.hold = new ArrayList<>();
        this.currWeight = 0;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (suitcase.getCurrentWeight() + this.currWeight <= this.maxWeight) {
            this.hold.add(suitcase);
            this.currWeight += suitcase.getCurrentWeight();
        }
    }

    public void printItems() {
        for (Suitcase suitcase : hold) {
            suitcase.printItems();
        }
    }
    @Override
    public String toString() {
        return hold.size() + " suitcases" + "(" + this.currWeight + " kg)";
    }
}
