
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        printArray(numbers);
        sort(numbers);
        System.out.println("");
        printArray(numbers);
    }

    public static int smallest(int[] array) {
        if (array.length == 0) {
            return -1;
        }

        int min = array[0];
        for (int i = 1; i < array.length-1; ++i) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int indexOfSmallest(int[] array) {
        if (array.length == 0) {
            return -1;
        }
        int minIndex = 0;
        int min = array[0];

        for (int i = 1; i < array.length-1; ++i) {
            if (array[i] <= min) {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int indexOfSmallestFrom(int[] array, int index) {
        int minIndex = index;
        int min = array[index];

        for (int i = index; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            swap(array, i, indexOfSmallestFrom(array, i));
        }
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}

