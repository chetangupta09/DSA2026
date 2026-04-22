package DSA_EASY;

public class Palindrome {

    static int num = 12221;
    static int orginalNum = 12221;
    static String palindrome = "This number is not palindrome";
    int reverse=0;
    public static void main(String[] args) {
        Palindrome p=new Palindrome();

        //This methed by using string
        p.tellPalindromOrnot();

        //Palindrome Without Using String
        p.tellPalindromOrnotWithoutString();
    }

    private void tellPalindromOrnotWithoutString() {

        while(num!=0){
            int digit=num % 10;
            reverse=reverse *10 +digit;
            num=num/10;
        }

        if(reverse==orginalNum){
            palindrome = "This number is palindrome";
        }
        System.out.println(palindrome);
    }


    public void tellPalindromOrnot(){

        String strNum = String.valueOf(num);

        StringBuilder reverseNum = new StringBuilder(strNum);
        reverseNum.reverse();

        if (strNum.equals(reverseNum.toString())) {
            palindrome = "This number is palindrome";
        }

        System.out.println(palindrome);
    }


}
