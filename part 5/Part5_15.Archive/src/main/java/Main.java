
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> collection = new ArrayList<>();

        while(true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();

            if (identifier.isEmpty() || name.isEmpty()) {
                break;
            }
            Archive item = new Archive(identifier, name);

            if (!(collection.contains(item))) {
                collection.add(item);
            }
        }

        for (Archive item: collection) {
            System.out.println(item);
        }
    }
}
