package Assignment3;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENter a number ");
		int n = sc.nextInt();
		if(n<0) {
			try {
				throw new NumberFormatException("Number is negative");
			}catch(NumberFormatException e) {
				System.out.println(e.getMessage());
			}finally {
				sc.close();
			}
		
		}
		System.out.println("No error Found");
	}

}
