package Assignment6;

import java.util.Scanner;

public class Q06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a sentence ");
		String str = sc.nextLine();
		System.out.println("Enter the character you want to count ");
		char a = sc.next().charAt(0);
		System.out.println("No. of occurrences is "+count(str , a));
		sc.close();
		
	}
	public static int count(String str, char a) {
		int count = 0 ;
		for (int i = 0 ; i < str.length(); i++) {
			if (str.charAt(i)== a ) {
				count ++;
			}
			
		}
		return count ;
	}

}
/*
Enter a sentence 
Welcome
Enter the character you want to count 
e
No. of occurrences is 2
*/
