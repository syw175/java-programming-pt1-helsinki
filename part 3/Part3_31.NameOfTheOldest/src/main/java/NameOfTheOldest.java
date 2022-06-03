
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = -1;
        String name = "";
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] inputList = input.split(",");
            int age = Integer.valueOf(inputList[1]);
            if (age > oldest) {
                oldest = age;
                name = inputList[0];
            }
        }
        System.out.println("Name of the oldest: " + name);
    }
}
