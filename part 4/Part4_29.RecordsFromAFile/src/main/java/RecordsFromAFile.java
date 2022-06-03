
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file: ");
        String file = scanner.nextLine();

        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                String[] line = fileReader.nextLine().split(",");
                if (line.length == 0) {
                    continue;
                }
                System.out.print(line[0]);
                if (Integer.valueOf(line[1]) != 1) {
                    System.out.print(", age: " + line[1] + " years");
                } else {
                    System.out.print(", age: " + line[1] + " year");
                }
                System.out.println("");
            }
        } catch(Exception a) {
            System.out.println("Error reading the file: " + file);
        }
    }
}
