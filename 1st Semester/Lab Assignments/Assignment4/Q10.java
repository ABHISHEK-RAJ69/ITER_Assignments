import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		int ans =1;
		while (ans<=n/3) {
			ans*=3;
		}
		System.out.print("The largest power of 3 less than or equal to "+n+" is "+ans);
		sc.close();
	}

}
