
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points: [0-100]");
        int pts = Integer.valueOf(scan.nextLine());
        if (pts < 0) {
            System.out.println("Grade: impossible!");
        } else if (pts < 50) {
            System.out.println("Grade: failed");
        } else if (pts < 60) {
            System.out.println("Grade: 1");
        } else if (pts < 70) {
            System.out.println("Grade: 2");
        } else if (pts < 80) {
            System.out.println("Grade: 3");
        } else if (pts < 90) {
            System.out.println("Grade: 4");
        } else if (pts < 101) {
            System.out.println("Grade: 5");
        } else {
            System.out.println("Grade: incredible!");
        }
    }
}
