package DSA.GS;

public class Lec01E04 {
    public static void main(String[] args) {


//===================== For Loops in Java ====================
//    for (Initialization; TerminationCondition ; Updation){
//        Body
//    }

//        // 3 Iterations
        for( int count = 0; count < 3; count++ ) {
            System.out.println(count + " Hello World");
        }

        // O Iterations
        for( int count = 0; count < 0; count++ ) {
            System.out.println(count + " Hello World");
        }
//
//        // Infinite Loop ==> Runtime Error (Verdict: Time Limit Exceeded)
        for( int count = 0; count >= 0; count++ ) {
            System.out.println(count + " Coding Saga");
        }




    }
}
