import java.util.Scanner;

public class UserInterface {
    private TodoList todo;
    private Scanner scanner;

    public UserInterface(TodoList todo, Scanner scanner) {
        this.todo = todo;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String input = this.scanner.nextLine();
            if (input.equals("stop")) {
                break;
            }
            processCommand(input);
        }
    }

    public void processCommand(String command) {
        if (command.equals("add")) {
            add();
        } else if (command.equals("list")) {
            list();
        } else if (command.equals("remove")) {
            remove();
        } else {
            System.out.println("Unknown command");
        }
    }

    public void add() {
        System.out.println("To add: ");
        String add = this.scanner.nextLine();
        this.todo.add(add);
    }

    public void list() {
        this.todo.print();
    }

    public void remove() {
        System.out.println("Which one is removed? ");
        int choice = Integer.valueOf(this.scanner.nextLine());
        this.todo.remove(choice);
    }
}
