package dsaSAGA.Patterns;

import java.util.Scanner;

public class p3starPattern1 {
    public static void main(String[] args) {

        System.out.println("Type1 using nested for loop");
        for (int i = 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Type 2 using GRID Approach");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if(row => col) System.out.println("* ");
                else System.out.print("");
            }
        }


//        System.out.println("Type 3 using individual Star and Space approach");
//        Scanner scn2 = new Scanner(System.in);
//        int n2 = scn2.nextInt();
//        for (int row = 1; row <= n2; row++) {
//            for (int col = 1; col <= n2; col++) {
//
//            }
//        }




    }
}


/*
* Print Patterns:
*
*   Type 1: Lower Left Triangle
*       *
*       **
*       ***
*       ****
*       *****
*
*   Type 2: Upper Left Triangle
*       *****
*       ****
*       ***
*       **
*       *
*
*   Type 3: Lower Right Triangle
*            *
*           **
*          ***
*         ****
*        *****
*
*   Type 4: Upper Right Triangle
*        *****
*         ****
*          ***
*           **
*            *
*
*
*
*
*
*   APPROACH 1:
*   Simply using Nested For Loops
*
*   APPROACH 2:
*   GRID TECHNIQUE using Grid based Rows and Cols approach.
*
*        c1 c2 c3 c4 c5
*    r1  *  -  -  -  -
*    r2  *  *  -  -  -
*    r3  *  *  *  -  -
*    r4  *  *  *  *  -
*    r5  *  *  *  *  *
*
*   APPROACH 3:
*   USING operations individually for Stars and Spaces
*
*
*
* */