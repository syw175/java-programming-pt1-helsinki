import java.util.ArrayList;

public class Suitcase {
    private int maxWeight;
    private ArrayList<Item> items;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (this.getCurrentWeight() + item.getWeight() <= maxWeight) {
            items.add(item);
        }
    }

    public int getCurrentWeight() {
        int weight = 0;
        if (!this.items.isEmpty()) {
            for (Item item : items) {
                weight += item.getWeight();
            }
        }
        return weight;
    }

    public int totalWeight() {
        return this.getCurrentWeight();
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }

        Item heaviestItem = items.get(0);
        for (Item item : items) {
            if (item.getWeight() >= heaviestItem.getWeight()) {
                heaviestItem = item;
            }
        }
        return heaviestItem;
    }

    @Override
    public String toString() {
        if (items.isEmpty()) {
            return "no items (0 kg)";
        } else if (items.size()==1) {
            return items.size() + " item (" + this.getCurrentWeight() + " kg)";
        }
        return items.size() + " items (" + this.getCurrentWeight() + " kg)";
    }
}
