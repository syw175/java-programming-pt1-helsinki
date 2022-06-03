
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.valueOf(scanner.nextLine());
        int sec = Integer.valueOf(scanner.nextLine());
        double sqrRoot = Math.sqrt(first+sec);
        System.out.println(sqrRoot);

    }
}
