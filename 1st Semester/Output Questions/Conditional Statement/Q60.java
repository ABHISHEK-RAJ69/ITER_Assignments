public class Q60 {
    public static void main(String[] args) {
        int number1 =111, number2 = 101;
        switch (number1 & number2){
            case 1:
                System.out.println("-1-");
            case 101 :
                System.out.println("-101-");
            case 111:
                System.out.println("-111-");
            case 010:
                System.out.println("-010-");
            default :
                System.out.println("-"+ (number1 & number2) +"-"); //ERROE correction x & y=> number1 & number 2
        }
    }
}
// OUTPUT:-
// -101-
// -111-
// -010-
// -101-
