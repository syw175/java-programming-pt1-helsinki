
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container sec = new Container();

        while (true) {
            System.out.print("First: " + first + "\n");
            System.out.println("Second: " + sec);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;

            }
            String[] partsOfInput = input.split(" ");
            input = partsOfInput[0];
            int amount = Integer.valueOf(partsOfInput[1]);

            if (input.equals("add")) {
                first.add(amount);
            } else if (input.equals("remove")) {
                sec.remove(amount);
            } else if (input.equals("move")) {
                if (amount > first.contains()) {
                    amount = first.contains();
                    first.remove(amount);
                    sec.add(amount);
                } else {
                    first.remove(amount);
                    sec.add(amount);
                }
            }
        }
    }

}
