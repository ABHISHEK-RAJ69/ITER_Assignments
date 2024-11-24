public class Q9 {
    public static void main(String[] args) {
        int x = 10 ; 
        if (++x <10  && (x/0 >10)) { // 11<10  => false
            System.out.println("Hello");
        }else{
            System.out.println("HIIII");
        }
    }
}
// Output:
// HIIII