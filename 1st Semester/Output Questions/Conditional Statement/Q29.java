public class Q29 {
    public static void main(String[] args) {
        int x = 20 ; 
        int y = 25 ; 
        if (++x < (y = y -= 4) || (x =x +=4) >y){
            System.out.println(x + " , "+y);
        }
    }
}
// OUTPUT:-
// 25 , 21
// description
    // 21<21 => false 
    // x=21 and y = 21
    // then it went for or condition
    // x= 21+4 =25 >21 => true 
    // x = 25  , y = 21 