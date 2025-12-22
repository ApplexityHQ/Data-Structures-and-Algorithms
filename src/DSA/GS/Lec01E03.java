package DSA.GS;

import java.util.Scanner;

public class Lec01E03 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);


//===================== Inputs in Java ====================
        /*
         *  Scanner scn = new Scanner(System.in);
         *   For integers only : scn.nextInt();
         *   For Strings only : scn.nextLine();
         *   If taken Both int & string in a same program: Integer.parseInt(scn.nextLine())
         *
         *
         * */


//        int marks = scn.nextInt();
//        double percentage = scn.nextDouble();
//        long phoneNo = scn.nextLong();
//        boolean isPass = scn.nextBoolean();
//
//        System.out.println("Your Marks: " + marks);
//        System.out.println("Your %: " + percentage);
//        System.out.println("Your Ph No. : " + phoneNo);
//        System.out.println("Your Ph No. : " + isPass);



        // Taking inputs, nextInt will stop at taking input once it'll come across either at a space or enter character.

        String firstName = "Applexity";
        System.out.println("Your First Name: " + firstName);

        String str = "AppX teat@gmail.com";
        System.out.println(str);

        String name = scn.nextLine();
        System.out.println("Hello " + name);

        // is input is word : scn.next();
        // if input is line : scn.nexLine();





        // ====================== If else loop & else if ladder  =====================

        // Write a program to find even?
//        int a = scn.nextInt();
//        if (a % 2 == 0) {
//            System.out.println("even");
//        }else{
//            System.out.println("odd");
//        }


        // Write a program to find Vovel and Consonent

//        char alphabet = scn.nextLine().charAt(0);
//        if (alphabet == 'a' || alphabet == 'e'|| alphabet == 'i'|| alphabet == 'o'|| alphabet == 'u') {
//            System.out.println("Vovel");
//        }else {
//            System.out.println("Consonant");
//        }












    }
}
