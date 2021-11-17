import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array) {
        int search = array[0];
        for (int item : array) {
            if (item < search) {
                search = item;
            }
        }
        return search;
    }

    public static int indexOfSmallest(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int index = startIndex;
        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int helper = array[index1];
        array[index1] = array[index2];
        array[index2] = helper;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length -1; i++) {
            int smallestIndex = indexOfSmallestFrom(array, i);
            swap(array, i, smallestIndex);
        }
        System.out.println(Arrays.toString(array));
    }

}

