package assignment4;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int ans=0,rem;
		int num = sc.nextInt();
		int i=1;
		while (num!=0) {
			rem =num%10;
			if(rem!=0) {
				ans=ans+rem*i;
				i*=10;
			}
			num/=10;
		}
		System.out.println(ans);
		sc.close();
	}

}
