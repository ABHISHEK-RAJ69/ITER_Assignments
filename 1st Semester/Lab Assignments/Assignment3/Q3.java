package assignment3;
import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first numbers :");
		int a = sc.nextInt();
		System.out.println("Enter second numbers :");
		int b = sc.nextInt();
		System.out.println("Enter third numbers :");
		int c = sc.nextInt();
		if (a>b && b>c) {
			System.out.println("Decreasing !");
		}else if (a<b && b<c) {
			System.out.println("Increasing!");
		}else {
			System.out.println("Neither Increasing nor Decreasing .");
		}
		sc.close();
	}

}