package DSA_EASY;

public class Recursion {

    static int n = 10;
    static int i= 1;
    public static void main(String[] args) {
        //1. PRINT NUMBER N TO 1
        //printNumberByNTime(n);

        //2. PRINT NAME N TIME
        // printNameByNTime(n);

        //3. PRINT NAME 1 to N
        printNameBy1ToN(n,i);
    }

    private static void printNameBy1ToN(int n,int i) {

        if(i<=n){
            System.out.println("NUMBER"+i);
            i+=1;
            printNameBy1ToN(n,i);
        }
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
