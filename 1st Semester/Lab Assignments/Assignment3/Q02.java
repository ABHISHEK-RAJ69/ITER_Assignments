package Assignment3;
import java.util.Scanner;
public class Q02 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in );
		System.out.println("Enter how much water Alice drunk");
		int d=sc.nextInt();
		if (d>=5000) {
			System.out.println(" Yes , Alice is following doctor's advice .");
			
		}else {
			System.out.println(" No , Alice is not following doctor's advice .");
		}
		 
		sc.close();
	}

}
