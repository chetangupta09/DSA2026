package DSA_EASY;

public class Palindrome {

    static int num = 121;
    static String palindrome = "This number is not palindrome";

    public static void main(String[] args) {

        String strNum = String.valueOf(num);

        StringBuilder reverseNum = new StringBuilder(strNum);
        reverseNum.reverse();

        if (strNum.equals(reverseNum.toString())) {
            palindrome = "This number is palindrome";
        }

        System.out.println(palindrome);
    }
}
