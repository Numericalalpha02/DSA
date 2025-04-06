import java.util.Scanner;

public class Execution_Time {

    public static void fun() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("fun() starts");
        System.out.println("Press enter to stop fun");
        
        while (true) {
            if (scanner.hasNextLine()) {
                break;
            }
        }
        
        System.out.println("fun() ends");
        scanner.close();
    }

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        fun();
        long endTime = System.nanoTime();
        
        double timeTaken = (endTime - startTime) / 1e9; // Convert nanoseconds to seconds
        System.out.printf("fun() took %.6f seconds to execute \n", timeTaken);
    }
}
