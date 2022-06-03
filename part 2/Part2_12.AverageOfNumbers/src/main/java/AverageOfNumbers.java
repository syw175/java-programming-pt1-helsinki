
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCount = 0;
        int sum = 0;
        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 0) {
                break;
            }
            numCount = numCount + 1;
            sum = sum + num;
        }
        double avg = 1.0 * sum / numCount;
        System.out.println("Average of the numbers: " + avg);
    }
}
