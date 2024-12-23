package Assignment5;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int sum=1;
		for (int i=2;i<=n;i++) {
			for(int j =1;j<=i;j++) {
				sum+=j;
			}
		}
		System.out.println("Sum of the series is : "+sum);
		
		sc.close();
    }
}
/*
Output:-
Enter a number : 
3
Sum of the series is : 10
*/