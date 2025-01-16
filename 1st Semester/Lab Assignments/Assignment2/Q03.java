package Assignment2;
import java.util.Scanner;
public class Q03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Employee's basic Salary ");
		double s=sc.nextDouble();
		double da=s*0.4;
		double hra=s*0.2;
		System.out.println("His dearness allowance = "+da);
		System.out.println("His House rent allowance = "+hra);
		
		System.out.println("His gross Salary = "+(s+da+hra));
		sc.close();
		
		
	}

}
