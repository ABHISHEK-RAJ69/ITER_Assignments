public class Q53 {
    public static void main(String[] args) {
        int a = 10 , b = 5;
        switch (a<b){ //false
            case true:
                System.out.println("WOW");
                break;
            case false:
                System.out.println("Its working");
                break;
        }
    }
}
// output:-
// Its working