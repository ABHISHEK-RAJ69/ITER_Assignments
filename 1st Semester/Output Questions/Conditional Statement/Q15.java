public class Q15 {
    public static void main(String[] args) {
        int a = 7 ; 
        if (a*2 ==a<<33) { 
            //(7<< 33) 
            // => 7>>(32%33 =1) 
            //=> 7>>1 
            // => 7* 2 to the power 1
            // 14 == 14
            System.out.println("yup");
        }else{
            System.out.println("Nope !");
        }
    }
}
