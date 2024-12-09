package assignment4;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int sum=0;
		int count =0;
		System.out.print("Random numbers generated are: ");
		do {
			int random = 1+ (int)(Math.random()*(num));
			sum+=random;
			System.out.print(random+" ");
			count++;
			
		}while(count<num);
		System.out.println("");
//		System.out.println("\n sum "+sum);
		int avg =sum/num;
		System.out.println("Average of "+num+" random numbers are "+avg);
		sc.close();
	}

}
