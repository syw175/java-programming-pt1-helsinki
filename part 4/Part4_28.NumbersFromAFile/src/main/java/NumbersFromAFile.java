
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        int numCount = 0;
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                int lineNum = Integer.valueOf(fileReader.nextLine());
                if (lowerBound <= lineNum && lineNum <= upperBound) {
                    numCount++;
                }
            }
        } catch (Exception e) {
            System.out.println("Error reading: " + file);
        }
        System.out.println("Numbers: " + numCount);
    }

}
