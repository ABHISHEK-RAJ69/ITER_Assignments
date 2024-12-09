package assignment4;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int x =sc.nextInt();
		System.out.println("Enter second number : ");
		int y =sc.nextInt();
		int temp ;	
		while(y!=0) {
			temp =y;
			y =x%y;
			x=temp;
		}
		System.out.println(x);
		sc.close();
	}

}
