package DSA.Patterns;

import java.util.Scanner;

public class p2GridnXn {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of rows in the grid:");
        int n = in.nextInt();

        System.out.println("Enter the number of columns in the grid:");
        int m = in.nextInt();

        System.out.println("Here's the grid:");

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

// Print grid for n X n ,  m x n