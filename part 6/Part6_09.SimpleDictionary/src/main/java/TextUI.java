import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String input = this.scanner.nextLine();
            if (input.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            executeCommand(input);
        }
    }

    public void executeCommand(String input) {
        if (input.equals("add")) {
            add();
        } else if (input.equals("search")) {
            search();
        } else {
            System.out.println("Unknown command");
        }
    }

    public void add() {
        System.out.println("Word:");
        String word = this.scanner.nextLine();
        System.out.println("Translation:");
        String translate = this.scanner.nextLine();
        this.dictionary.add(word, translate);
    }

    public void search() {
        System.out.println("To be translated: ");
        String search = this.scanner.nextLine();
        if (this.dictionary.translate(search) != null) {
            System.out.println("Translation: " + this.dictionary.translate(search));
        } else {
            System.out.printf("Word " + search + " was not found");
        }
    }
}
