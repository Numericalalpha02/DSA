
public class n_natural2 {

    public static int findSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        findSum(10000000);
        long endTime = System.nanoTime();
        
        double timeTaken = (endTime - startTime) / 1e9; // Convert nanoseconds to seconds
        System.out.printf("findSum(int n) took %.6f seconds to execute \n", timeTaken);
    }
}
