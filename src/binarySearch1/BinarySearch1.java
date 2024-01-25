package binarySearch1;

public class BinarySearch1 {

    public static void main(String[] args) {

        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        int key = 77;
        int result = binarySearch(array, key);
        if (result != key) {
            System.out.println("Element found at index " + result + "\nkey " + key);
        } else {
            System.out.println("Element not found");
        }

    }

    static int binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == key) {
                return mid;
            } else if (array[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
            return -1;
    }
}
