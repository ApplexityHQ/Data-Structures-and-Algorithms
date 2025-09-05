package pepCoding.Basics.GettingStarted.JavaFoundation;

public class Conditionals {
    public static void main(String[] args) {

        int x = 11;

        // If else stmt
        if (x % 2 == 0){
            System.out.println("x is even");
        }else{
            System.out.println("x is odd");
        }
        System.out.println("Hardwork is Better Than Smartwork");


        // Que-1: Compare two Numbers, if they're equal, > or < each other

        // Ans-1: Method-1
        int n1 = 10;
        int n2 = 15;
        if(n1 == n2){
            System.out.println(n1 + " is equal to " + n2);
        }else{
            if(n1 > n2){
                System.out.println(n1 + " is greater than " + n2);
            }else {
                System.out.println(n1 + " is less than " + n2);
            }
        }

        // Ans-1: Method-2
        int p1 = 12;
        int p2 = 12;
        if(p1 == p2){
            System.out.println(p1 + " is equal to " + p2);
        }else if((p1 > p2)) {
            System.out.println(p1 + " is greater than " + p2);
        }else{
            System.out.println(p1 + " is less than " + p2);
        }



    }
}

// == opertor compares two values on both the sides.
// First Declare then Initialize
// Ye nahi toh ye, YAAAA Pehlaa Sach!!
