import java.util.Arrays;

public class reverse_array2 {
    // Function to reverse an array in place
    public static void reverseArray(int[] arr, int start, int end) {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Utility function to print an array
    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    // Driver function to test above functions
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        printArray(arr);
        reverseArray(arr, 0, arr.length - 1);
        System.out.println("Reversed array is:");
        printArray(arr);
    }
}
