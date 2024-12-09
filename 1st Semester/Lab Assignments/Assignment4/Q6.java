package assignment4;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base : ");
		int b = sc.nextInt();
		int p =sc.nextInt();
		int ans =1;
		for(int i =1 ;i<=p;i++) {
			ans*=b;
		}
		System.out.println(b+" to the power "+p +"is: "+ans);
		sc.close();
	}
}
