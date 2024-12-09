import java.util.Scanner;
public class HQ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();

        int sum =0, product =1;
        if (n%2!=0) {
            product=n;
        }
        for(int i = 2; i<=n ; i+=2){
            sum+=i;
            product*=(i-1);
        }
        System.out.println(sum);
        System.out.println(product);

        sc.close();
    }
}
// Output:-
// 30
// 10395