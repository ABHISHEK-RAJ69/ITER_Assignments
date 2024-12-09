public class HQ2 {
    public static void main(String[] args) {
        int sum =0, i ;
        for (i=3;i<1000;i+=3){
            if (i%5!=0) {
                sum+=i;
            }
        }
        for(i=5;i<1000;i+=5){
            sum+=i;
        }
        System.out.println("The sum of all the multiples of 3 or 5 below 1000 is "+ sum);
    }
}
// Output:-
// The sum of all the multiples of 3 or 5 below 1000 is 233168