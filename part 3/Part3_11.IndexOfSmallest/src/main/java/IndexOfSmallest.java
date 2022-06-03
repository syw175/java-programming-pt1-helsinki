
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <Integer> list = new ArrayList<>();
        // implement here a program that reads user input
        // until the user enters 9999
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 9999) {
                break;
            }
            list.add(num);
        }

        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        ArrayList <Integer> indexList = new ArrayList<>();
        int smallest = list.get(0);
        for (int i = 1; i <list.size(); i++) {
            if (list.get(i) <= smallest) {
                smallest = list.get(i);
                indexList.add(i);
            }
        }
        System.out.println("Smallest number: " + smallest);
        for (int i = 0; i < indexList.size(); i++) {
            System.out.println("Found at index: " + indexList.get(i));
        }
    }
}
