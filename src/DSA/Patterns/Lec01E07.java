package DSA.Patterns;

public class Lec01E07 {
    public static void main(String[] args) {
        /*
         * Pattern #1 Type Printing
         *           output:
         *           * ** *** **** *****
         * */

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print(" ");
        }


    }




}

