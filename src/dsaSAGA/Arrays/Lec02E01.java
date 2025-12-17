package dsaSAGA.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Lec02E01 {
    public static void main(String[] args) {
        // 1. Array Declaration
        // int[] arr;
        int[] arr = null;
        System.out.println(arr);

        // 2. Declarations and Initialization.
        // int[] nums = new int[5];
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] nums = new int[n];
        System.out.println(nums);
        System.out.println(Arrays.toString(nums));


        // 3. Random Access (0 based indexing)
        nums[0] = 44;
        nums[1] = 13;
        nums[2] = 187;
        nums[3] = 47;
        nums[4] = 50;


        System.out.print(nums[0] + " ");
        System.out.print(nums[1] + " ");
        System.out.print(nums[2] + " ");
        System.out.print(nums[3] + " ");
        System.out.println(nums[4] + " ");


        for(int idx = 0; idx < nums.length; idx++) {
            System.out.println(nums[idx] + " ");
        }

        // 4. Arrays & Functions
        printArray(nums);

    }


    public static void printArray(int[] nums) {
        for (int idx = 0; idx < nums.length; idx++) {
            System.out.println(nums[idx] + " ");
        } 
    }
}
