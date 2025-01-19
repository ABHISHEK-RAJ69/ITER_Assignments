package Assignment6;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a string ");
		System.out.println("No. of vowels = "+(count(sc.nextLine())));
		sc.close();
	}
	public static int count(String str) {
		int count = 0;
		str = str.toUpperCase();
		for (int i = 0 ; i< str.length();i++) {
			char ch = str.charAt(i);
			if(ch =='A'|| ch =='E' || ch =='I' || ch =='O' || ch =='U') {
				count++;
				str = str.replace(ch, ' ');
			}
		}
		return count ;
	}

}
/* 
Output:-
Enter a string 
Welcome
No. of vowels = 2
*/