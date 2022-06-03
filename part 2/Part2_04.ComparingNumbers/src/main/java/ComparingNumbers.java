
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.valueOf(scanner.nextLine());
        int sec = Integer.valueOf(scanner.nextLine());
        if (first==sec) {
            System.out.println(first + " is equal to " + sec);
        } else if (first < sec) {
            System.out.println(first + " is smaller than " + sec);
        } else {
            System.out.println(first + " is greater than " + sec);
        }
    }
}
