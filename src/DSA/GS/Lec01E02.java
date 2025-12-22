package DSA.GS;

public class Lec01E02 {
    public static void main(String[] args) {

        // int inf = Integer.MAX_VALUE + 1;
        // System.out.println(inf);
        // infinity + 1 = -infinity

        // inf = Integer.MIN_VALUE - 1;
        // System.out.println(inf);
        // -infinity - 1 = +infinity

        // double percentage = 45.5;
        // System.out.println(percentage);

        float percentage2 = 45.5f;
        // append f at last
        System.out.println(percentage2);

        long inf2 = 74382984378924937l;
        // append l at last
        System.out.println(inf2);


        char initial = 'b';
        System.out.println(initial);

        char digit = '0';
        System.out.println(digit);

        char space = ' ';
        System.out.println(space);

        char hash = '#';
        System.out.println(hash);

//      char hindi = '\u0917';
//      System.out.println(hindi);

//        char hindi = '\u092D';
//        System.out.println(hindi);

//        you can also print emojis also, using unicodes.


        int a = 20, b =10;
        int c = a + b;
        System.out.println(c);

        c = a - b;
        System.out.println(c);
        c = a * b;
        System.out.println(c);
        c = a / b; // int/int --> integer (floor) division
        // truncates decimal places
        System.out.println(c);
        c = a % b; // range [0, b-1]
        System.out.println(c);

        System.out.println(3 / 2); // 1.5 -> 1
        System.out.println(3 / 4); // 0.75 -> 0
        System.out.println(-5 / 2); // -2.5 --> -2

        // double division
        double h = 3 / 2; // store 1 -> 1.0
        System.out.println(h);

        double e = 4 / 2; // store 2 -> 2.0
        System.out.println(e);


        int var1 = 'a';
        System.out.println(var1);

        int var2 = '0';
        System.out.println(var2);

        int var3 = 'a' + 5; // 97 + 5 = 102
        System.out.println(var3);

        int var4 = '0' - 5; // 48 - 5 = 43
        System.out.println(var4);

        int x = 100;
        long y = x;
        System.out.println(y);

        int p = (int)y; // 8 bit --> 4 bytes: fit
        System.out.println(p);

        long d = 9999999999999l;
        p = (int)d;
        System.out.println(p);

        int vaar = 97;
        char ch1 = (char)vaar;
        // int ( 4 byte) -> char (2 byte)
        // implicitly not possible: error 0r worked
        System.out.println(ch1);

        int vaar2 = 48;
        char ch2 = (char)vaar2;
        System.out.println(ch2);

        int vaar3 = 32;
        char ch3 = (char)vaar3;
        System.out.println(ch3);

    }
}

/*
 *
 * ======== 1. Boiler Plate ==========
 *
 *   import java.util.*;
 *   public class Main{
 *         public static void main (Strings[] args) {
 *          // code here
 *          }
 *   }
 *
 *   - Notes:
 *       - It's a case sensitive language (Small/Capital letter)
 *       - With Identation code looks clear
 *
 * ======= 2. Print stmts ================
 *   - println("") : Print with a new line
 *   - print("") : Print without a new line ( with an enter, after printing )
 *
 *
 *
 * ============ Data Types and Variables continued ...  ==========================
 *
 * 1. Numerical Datatypes and their Ranges:
 *       - learn std ranges to save from Overflow
 *       - our Number system follows Cyclic no. sys.
 *       - i.e adding 1 to max value will give you the -ve
 * ================================================================
 *
 *
 * note:
 *  - Java doesn't have pointers
 *  - therefore, we cannot get the address of a variable, unlike c++.
 *  - java follows Unicode (superset of ASCII)
 *  65 - 90 : A - Z
 *  97 - 122 : a - z
 *  48 - 60 : 0 - 9
 *  0 : null
 *
 *
 *
 * =============== Arithmetics ===================
 *
 * Operators:
 * 1. Unary optr
 * 2. Binary optr
 *
 *
 *
 *
 * ========= Concatenation =================
 *
 *
 *
 *
 *
 *
 * ================ Typecasting ==============================
 * 1. Upcasting
 * 2. Downcasting
 *
 * Implicit and Explicit type conversion
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * */



