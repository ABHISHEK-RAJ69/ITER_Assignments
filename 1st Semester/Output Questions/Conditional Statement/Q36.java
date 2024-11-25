public class Q36 {
    public static void main(String[] args) {
        int number = 4 ;
        double alpha = -1.0;
        if ( number > 0){
            if (alpha >0 ){
                System.out.println("Here i am !");
            }else if (number < alpha){
                System.out.println("No, I'm here !");
            }else {
                System.out.println("No, actually , I'm here !");
                System.out.println("Most probably I am there ");
            }
        }
    }
}
// Output:-
// No, actually , I'm here !
// Most probably I am there
