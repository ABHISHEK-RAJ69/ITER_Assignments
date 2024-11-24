public class Q11 {
    public static void main(String[] args) {
        boolean x = true ;
        boolean y = false;
        if ((x && y )| (x || y )){
            //( 0 and 1= 0) or ( 0 or 1 =1) => 0 or 1 = 1 => ture 
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
// Output
// true