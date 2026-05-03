package DSA_EASY;

public class PatternProblems {

    int number=6;
    public static void main(String[] args) {
        PatternProblems p=new PatternProblems();
        //Rectangular Star Pattern
        p.printRectangularStarPattern(p.number);

        //Right-Angled Triangle
        p.printRightAngledTriangle(p.number);

       // Right-Angled Number
        p.printRightAngledNumber(p.number);

        //Inverted Right Pyramid
        p.printInvertedRightPyramid(p.number);
    }

    private void printInvertedRightPyramid(int number) {

        for(int i =number;i<=number;i--){
            for(int j=1;j<number;j++) {
                if(j<i){
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }

    private void printRightAngledNumber(int number) {

        for(int i =1;i<number;i++){
            for(int j=1;j<number;j++) {
                if(j<i){
                    System.out.print(j);
                }

            }
            System.out.println("");
        }
    }

    private void printRightAngledTriangle(int number) {

        for(int i =1;i<number;i++){
            for(int j=1;j<number;j++) {
                if(j<i){
                    System.out.print("*");
                }

            }
            System.out.println("");
        }
    }

    void printRectangularStarPattern(int number){

        for(int i =1;i<number;i++){
            for(int j=1;j<number;j++) {
                    System.out.print("*");
            }
            System.out.println("");
        }

    }
}
