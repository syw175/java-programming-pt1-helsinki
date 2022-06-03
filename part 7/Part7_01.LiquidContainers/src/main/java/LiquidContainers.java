
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {

        int first = 0;
        int sec = 0;
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("First: " + first + "/100 \nSecond: " + sec + "/100\n");
            String input = scan.nextLine();
            String[] parts = input.split(" ");
            if (input.equals("quit")) {
                break;
            }

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            if(amount < 0) {
                continue;
            }

            if (command.equals("add")) {
                first += amount;
                if (first > 100) {
                    first = 100;
                }

            } else if (command.equals("move")) {
                if (amount >= first) {
                    sec += first;
                    first -= first;
                } else {
                    first -= amount;
                    sec += amount;
                }
                if (sec > 100)
                sec = 100;

            }

            else {
                sec -= amount;
                if (sec < 0) {
                    sec = 0;
                }
            }
        }
    }

}
