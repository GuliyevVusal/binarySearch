package binarySearch2;

import java.util.Arrays;
import java.util.Random;

public class BinarySearch2 {

    public static void main(String[] args) {

        int[] array = generateSortedArray(1000); // 1 den 1000-e qeder bir array yaratdiq
        int target = new Random().nextInt(1000) + 1; // 1-ile 1000 arasinda random bir reqem sec

        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Target: " + target);

        int result = binarySearch(array, target);

        if (result != -1) {
            System.out.println("Element found at index " + result + "\nTarget: " + target);
        } else {
            System.out.println("Target digit not found in array.");
        }
    }

    static int[] generateSortedArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = array[mid];
            if (guess == target) {
                return mid;// axtardigimiz reqem tapildi
            }
            if (guess < target) {
                low = mid + 1; // axtardigimiz reqem sag terefdedi.
            } else {
                high = mid - 1; // axtardigimiz reqem sol terefedi.
            }
        }
        return -1; // Axtardigimiz tapilmadi.
    }
}
