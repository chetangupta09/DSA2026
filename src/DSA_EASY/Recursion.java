package DSA_EASY;

public class Recursion {

    static int n = 2;

    public static void main(String[] args) {
        //PRINT NUMBER 1 TO N
        printNumberByNTime(n);
        //PRINT NAME N TIME
        // printNameByNTime(n);
    }

    private static void printNumberByNTime(int n) {
        System.out.println("NUMBER"+n);
        if (n > 1) {
            n -= 1;
            printNumberByNTime(n);

        }

    }

    private static void printNameByNTime(int n) {
        System.out.println("TEST CODE");
        if (n > 1) {
            n -= 1;
            printNameByNTime(n);

        }

    }
}
