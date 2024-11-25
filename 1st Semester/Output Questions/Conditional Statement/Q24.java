public class Q24 {
    public static void main(String[] args) {
        int var1 = 5 ; 
        int var2 = 6;
        if ((var2 = 1)==var1){ // var2 ( 5 => 1) then false 
            System.out.println(var2);
        }else{
            System.out.println(++var2); // 1=>2
        }
    }
}
// OUTPUT:-
// 2