
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int sec = Integer.valueOf(scanner.nextLine());
        int sum = first + sec;
        int diff = first - sec;
        int prod = first*sec;
        double div = (double) first/sec;

        System.out.println(first + " + " + sec + " = " + sum);
        System.out.println(first + " - " + sec + " = " + diff);
        System.out.println(first + " * " + sec + " = " + prod);
        System.out.println(first + " / " + sec + " = " + div);
    }
}
