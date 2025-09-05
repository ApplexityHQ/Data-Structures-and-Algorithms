package pepCoding.Basics.GettingStarted.JavaFoundation;

public class Variables {
    public static void main(String[] args) {
        int x = 15;
        int y = 10;
        int sum = x + y;
        System.out.println("Sum of " + x + " And " + y + " is = " + sum);
        int prd = x*y;
        System.out.println("Prd of " + x + " And " + y + " is = " + prd);
        // x/y, y/x, x%y
        int v1 = x / y;
        int v2 = y / x;
        int v3 = x % y;
        System.out.println(v1); // op: 1
        System.out.println(v2); // op: 0
        System.out.println(v3); // op: 5
        // find the value of given function.
        System.out.println( (x * y) / (x + y) ); // output should be 6, bcz: 150/25 = 6

    }
}


// % : Modulo Operator (Gives Remainder)
// / : Division Operator (Gives Quotient)
// BODMAS rule of Mathematics does not work here.
// Priority Order : (* == / == % )   >>   ( + == - )
// Use Brackets whenever required in a function.