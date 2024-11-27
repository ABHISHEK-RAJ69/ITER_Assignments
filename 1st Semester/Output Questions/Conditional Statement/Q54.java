public class Q54 {
    int x =4;
    public static void main(String[] args) {
        int a =10 , b =5;
        
        switch (a <b ? a: b-1){ //4
            case 5:
                System.out.println("WOW");
                break;
            case 3 :
                System.out.println("Its working ");
                break;
            case  x:
                System.out.println("Ooh...");
                break;
            default:
                System.out.println("Fine...");
        } 
    }
}
// output:-
// Cannot make a static reference to the non-static field x