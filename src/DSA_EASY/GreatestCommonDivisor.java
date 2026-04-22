package DSA_EASY;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        int num1=9,num2=18;
        int gcd=checkGreatestCommonDivisor(num1,num2);

        System.out.println("GCD: "+gcd);
    }

    static int checkGreatestCommonDivisor(int num1,int num2){
        int number=1;
        for(int i=1;i <= Math.min(num1, num2);i++){
            if(num1%i==0 && num2%i==0){
                number=i;
            }
        }
return number;

    }

}
