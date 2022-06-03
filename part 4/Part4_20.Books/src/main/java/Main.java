import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        ArrayList <Books> books = new ArrayList<>();
        while (true) {
            System.out.println("Title: ");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.println("Pages: ");
            String pages = scanner.nextLine();
            System.out.println("Publication year: ");
            String years = scanner.nextLine();
            books.add(new Books(name, pages, years));
        }

        System.out.println("What information will be printed? ");
        String input = scanner.nextLine();

        if (input.equals("everything")) {
            for (Books book: books) {
                System.out.println(book);
            }
        } else {
            for (Books book: books) {
                System.out.println(book.getName());
            }
        }
    }
}
