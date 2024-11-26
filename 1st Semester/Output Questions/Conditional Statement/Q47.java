public class Q47 {
    public static void main(String[] args) {
        double x= 6.2;
        if (x-->= 6.0){
            System.out.println("first ");
        }
        if (--x >= 5.0) {
            System.out.println("second");
        }
        if(x-- >=4.0){
            System.out.println("third");
        }else{
            System.out.println("fourth");
        }
    }
}
// output:-
// first 
// third