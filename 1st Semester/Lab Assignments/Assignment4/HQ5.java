import java.util.Scanner;

public class HQ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows ");
        int n = sc.nextInt();
        String ruler ="";
        for (int i = 1 ; i <=n ;i++){
            ruler+=i+ruler;
            System.out.println(ruler);
        }
        sc.close();
    }
}
// Output:-

// Enter number of rows 
//4

//1
// 121
// 1213121
// 121312141213121