package Assignment6;

import java.util.Scanner;

public class Q08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string ");
		String str = sc .nextLine();
		System.out.println("String is palindrome :"+ checkPalindrome(str));
		sc.close();
	}
	public static boolean checkPalindrome(String str ) {
		String rev="";
		str = str.toLowerCase();
		for (int i = 0 ; i < str.length(); i ++) {
			rev = str.charAt(i)+rev;
		}
		return str.equals(rev);		
	}

}
/*
Output:-
Enter a string 
Madam
String is palindrome :true
*/