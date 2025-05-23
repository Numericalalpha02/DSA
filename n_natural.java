
public class n_natural {
 
    public static int findSum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        findSum(10000000);
        long endTime = System.nanoTime();

        double timeTaken = (endTime - startTime) / 1e9; // Convert nanoseconds to seconds
        System.out.printf("findSum(int n) took %.6f seconds to execute \n", timeTaken);
    }
}
