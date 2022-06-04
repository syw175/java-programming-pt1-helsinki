import java.util.Scanner;
import java.util.ArrayList;

public class UserInterface {
    private Scanner scanner;
    private ArrayList<Bird> birds;

    public UserInterface(Scanner scanner, ArrayList<Bird> birds) {
        this.scanner = scanner;
        this.birds = birds;
    }

    public void start() {
        while (true) {
            System.out.println("?");
            String input = scanner.nextLine();
            if (!isValidInput(input)) {
                System.out.println("Not a valid command");
                continue;
            }
            executeCommand(input);
        }
    }

    public void executeCommand(String input) {
        if (input.equals("Add")) {
            add();
        } else if (input.equals("All")) {
            printAll();
        } else if (input.equals("Quit")) {
            quit();
        } else if (input.equals("One")) {
            print();
        } else if (input.equals("Observation")) {
            observation();
        }
    }

    public boolean isValidInput(String string) {
        String[] validInputs = {"Add", "Observation", "All", "One", "Quit"};
        boolean found = false;
        for (int i = 0; i < validInputs.length; ++i) {
            if (validInputs[i].equals(string)) {
                found = true;
            }
        }
        return found;
    }

    public void add() {
        System.out.println("Name: ");
        String name = scanner.nextLine();
        System.out.println("Name in Latin: ");
        String nameLatin = scanner.nextLine();
        this.birds.add(new Bird(name, nameLatin));
    }

    public void printAll() {
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }

    public void print() {
        System.out.println("Bird? ");
        String desiredBird = scanner.nextLine();
        Bird printBird = searchForBird(desiredBird);

        if (printBird != null) {
            System.out.println(printBird);
        } else {
            System.out.println("Bird not found!");
        }
    }

    public Bird searchForBird(String searchBird) {
        for (Bird bird : birds) {
            if (bird.getName().equals(searchBird)) {
                return bird;
            }
        }
        return null;
    }

    public void quit() {
        System.exit(0);
    }

    public void observation() {
        System.out.println("Bird? ");
        String desiredBird = scanner.nextLine();
        Bird bird = searchForBird(desiredBird);

        if (bird != null) {
            bird.addObservation();
        } else {
            System.out.println("Not a bird!");
        }
    }
}