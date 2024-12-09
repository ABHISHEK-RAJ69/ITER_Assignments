package assignment4;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int sum = 1,i=2;
		while(i<=num/2) {
			if(num%i==0) {
				sum+=i;
			}
			i++;
		}
		if(sum==num) {
			System.out.println(num +" is a perfect number");
		}else {
			System.out.println(num +" is not a perfect number");

		}
		sc.close();

	}

}
