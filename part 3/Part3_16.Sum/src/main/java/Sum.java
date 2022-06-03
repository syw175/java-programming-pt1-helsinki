
import java.util.ArrayList;

public class Sum {
    public static int sum(ArrayList <Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
    public static void main(String[] args) {
        // Try your method here
//        ArrayList <Integer> list = new ArrayList<>();
//        list.add(5);
//        list.add(67);
//        System.out.println(sum(list));
    }

}
