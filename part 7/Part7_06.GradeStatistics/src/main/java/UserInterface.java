import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private Gradebook gradebook;

    public UserInterface(Gradebook gradebook) {
        this.scanner = new Scanner(System.in);
        this.gradebook = gradebook;
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops: ");
        while (true) {
            int inputNum = Integer.valueOf(this.scanner.nextLine());
            if (inputNum == -1) {
                break;
            }
            gradebook.addGrade(inputNum);
        }
        System.out.println(gradebook);

    }
}
