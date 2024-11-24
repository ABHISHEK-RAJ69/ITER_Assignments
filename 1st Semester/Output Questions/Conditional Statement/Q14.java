public class Q14 {
    public static void main(String[] args) {
        char direction ='N';
        char West ='W';
        switch (direction) {
            case 'N':
                System.out.println("North");
                break;
            case 'E':
                System.out.println("East");
                break;
            case West: //ERROR 
                System.out.println("West");
                break;
            case 'S':
                System.out.println("South");
        }
    }
}
// ERROR :- case expressions must be constant expressions