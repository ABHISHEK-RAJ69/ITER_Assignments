public class Q42 {
    public static void main(String[] args) {
        int a = 12 + 21 * 3 - 9/2; // 71 
        int b = 14 - 32 * 4 + 175 / 8 -3; // -96
        // System.out.println( a +" " +b);
        if (++a > 71 && --b < 20){
            System.out.println("a = "+a + " b = "+ b );
        }
        if ( b-- == -97 || a-- < 100){
            System.out.println("a = "+ a + " b = "+b);
        }
    }
}

// output:-
// a = 72 b = -97
// a = 72 b = -98