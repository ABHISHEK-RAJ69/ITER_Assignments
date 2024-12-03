package assignment2;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter distance between two cities (in Km)");
		double x=sc.nextDouble();
		double m =x*1000;
		System.out.println(x+" Km = "+m+ " meters");
		double f=x*3280.8399;
		System.out.println(x+" Km = "+f+ " feets");
		double i=x*39370.0787;
		System.out.println(x+" Km = "+i+" inch ");
		double c =m*100;
		System.out.println(x+" Km = "+c+" centimeters");
		sc.close();
		
	}

}
