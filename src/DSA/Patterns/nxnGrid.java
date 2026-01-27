package DSA.Patterns;
import java.util.*;

public class nxnGrid {
    public static void main(String[] args) {

        // nxn * Grid
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
            for(int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
