import java.util.ArrayList;
public class Statistics {

    private int sum;
    private int count;
    public Statistics() {
        this.count = 0;
        this.sum = 0;
    }

    public void addNumber(int num) {
        this.count++;
        this.sum+= num;
    }
    public int getCount() {
        return this.count;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        if (this.count != 0) {
            return 1.0*this.sum/this.count;
        }
        return 0.0;
    }
}
