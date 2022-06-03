
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int posNum = 0;
        int posSum = 0;
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num < 0) {
                continue;
            }
            if (num == 0) {
                break;
            }
            posNum = posNum + 1;
            posSum = posSum + num;
        }
        if (posNum != 0) {
            System.out.println(1.0 * posSum / posNum);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
