package Assignment6;

import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the password");
		String p = sc.next();
		System.out.println(validPassword(p));
		sc.close();
	}
	static String validPassword(String p) {
		if(p.length() < 8 || (!(only(p))) || (! (count(p)))) {
			return "Invalid Password";
		}
		return "Valide Password";
	}
	static boolean only(String p ) {
		for (int i = 0 ; i < p.length();i++) {
			char ch= p.charAt(i);
			if(!(ch>'0' && ch < '9')||(ch > 'A' && ch < 'Z')||(ch > 'a' && ch < 'z')) {
				return false;
			}
		}
		return true ;
	}
	static boolean count(String str) {
		int count = 0 ;
		for (int i = 0 ; i< str.length() ; i++) {
			if(str.charAt(i) > '0' && str.charAt(i) < '9') {
				count ++;
				
			}
			if(count > 1) {
				return true ;
			}
		}
		return false;	
	}

}
/*
Output:-
Enter the password
hello
Invalid Password
*/
