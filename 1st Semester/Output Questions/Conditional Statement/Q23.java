public class Q23 {

    public static void main(String[] args) {
        int ok = 10 ;
        switch (ok) {
            default:
            System.out.println("default");
            case 0:
            System.out.println("true");
            case 1:
            System.out.println("false");
        }
    }
}
// OUTPUT:-
//      default
//      true
//      false
// Description:-
//      No case matched so it went to defalt and the executed all conditions as no brake statement was provided .