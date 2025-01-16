import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int a =sc.nextInt();
		System.out.println("Enter second number : ");
		int b =sc.nextInt();
		System.out.println("Enter third number : ");
		int c =sc.nextInt();
		
		int sum =0;
		for (int i =a ;i<=b ;i+=c) {
			System.out.print(i+" ");
			sum+=i;
		}System.out.println();
		
		System.out.println("The sum of number displayed is "+sum);
		sc.close();
	}

}
