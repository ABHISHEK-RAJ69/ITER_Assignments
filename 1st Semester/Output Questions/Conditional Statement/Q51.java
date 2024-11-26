public class Q51 {
    public static void main(String[] args) {
        int i = 1;
        switch(i){
            case i: //case expressions must be constant expressions
                System.out.println("case 1 executed");
                break;
            case i+1: //case expressions must be constant expressions
                System.out.println("case 2 executed");
                break;
            default:
                System.out.println("default block executed");
                break;
        }
    }
}
