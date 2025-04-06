//Array Reverse Using an Extra Array
import java.util.Arrays;

public class reverse_array {
    // Function to reverse an array using an extra array
    public static void reverseArrayExtraArray(int[] arr) {
        int size = arr.length;
        int[] reversedArr = new int[size];
        
        for (int i = 0; i < size; i++) {
            reversedArr[i] = arr[size - i - 1];
        }
        
        // Print reversed array
        System.out.print("Reversed Array: ");
        System.out.println(Arrays.toString(reversedArr));
    }

    public static void main(String[] args) {
        int[] originalArr = {1, 2, 3, 4, 5};
        reverseArrayExtraArray(originalArr);
    }
}
