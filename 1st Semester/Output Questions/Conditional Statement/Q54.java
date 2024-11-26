public class Q54 {
    public static void main(String[] args) {
        int a =10 , b =5;
        switch (a <b ? a: b-1){ //4
            case 5:
                System.out.println("WOW");
                break;
            case 3 :
                System.out.println("Its working ");
                break;
            case  4: // x=>4
                System.out.println("Ooh...");
                break;
            default:
                System.out.println("Fine...");
        } 
    }
}
// output:-
// Ooh... 