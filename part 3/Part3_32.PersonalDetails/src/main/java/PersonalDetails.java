
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longestName = "";
        int longestNameChars = 0;
        int sumYears = 0;
        int counter = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] inputList = input.split(",");
            if (inputList[0].length() > longestNameChars) {
                longestName = inputList[0];
                longestNameChars = inputList[0].length();
            }
            sumYears += Integer.valueOf(inputList[1]);
            counter++;
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (1.0*sumYears/counter));
    }
}
