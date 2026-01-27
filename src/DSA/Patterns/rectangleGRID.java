package DSA.Patterns;

import java.util.Scanner;

public class rectangleGRID {
    public static void main(String[] args) {
        // nxm * Grid
        // rows * cols
        // rows = 3
        // cols = 5
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int cols = scn.nextInt();
        for(int row = 1; row <= rows; row++) {
            for (int col = 1; col <= cols; col++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
