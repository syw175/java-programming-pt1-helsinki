
import java.sql.Array;
import java.util.Scanner;
import java.util.ArrayList;
public class mainProgram {

    public static void main(String[] args) {

        ArrayList<Bird> birds = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        UserInterface ui = new UserInterface(scan, birds);
        ui.start();

    }
}
