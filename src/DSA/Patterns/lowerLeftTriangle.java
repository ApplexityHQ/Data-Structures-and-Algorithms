package DSA.Patterns;
import java.util.*;
public class lowerLeftTriangle {
    public static void main(String[] args) {
        // https://www.hackerrank.com/contests/module-1-java-dsa-class-challenges/challenges/gkstr18-pattern-4/submissions/code/1403420164

        // Approach 1:
//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//        for (int row = 1; row <= n; row++) {
//            for (int col = 1; col <= row; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // Approach 2: (Grid Based Approach)
//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//        for (int row = 1; row <= n; row++) {
//            for (int col = 1; col <= row; col++) {
//                if(row >= col) {
//                    System.out.print("* ");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }


        // Approach 3: (stars count & space count based)
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int stars = 1, spaces = n - 1;
        for (int row = 1; row <= n; row++) {
            for (int count = 1; count <= stars; count++) {
                System.out.print("* ");
            }
            for (int count = 1; count <= spaces; count++) {
                System.out.print(" ");
            }
            System.out.println();
            stars++; spaces++;
        }


    }
}

/*
*       output:
*       *
*       * *
*       * * *
*       * * * *
*       * * * * *
*
* */
