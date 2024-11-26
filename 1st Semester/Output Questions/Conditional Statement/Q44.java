public class Q44 {
    public static void main(String[] args) {
        int x ='a';
        switch (x){
            case 5:
                x+=5;
            case 97://true
                x+=10; // x = 107
            case 98:
                x+=15; // x =122
                break;
            case 99:
                x+=20;
        }
        System.out.println(x);
    }
}
// output:-
// 122