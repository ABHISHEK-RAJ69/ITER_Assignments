package Assignment6;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("1: triangle \n2: square \n3 : circle \n4 : rectangle");
		System.out.println("Enter your choice ");
		char ch = sc.next().charAt(0);
		switch (ch) {
			case '1':
				System.out.println("You chose traingle \nEnter base and height ");
				System.out.println(area(sc.nextDouble(),sc.nextDouble()));
				break;
			case '2':
				System.out.println("You chose Square \nEnter a side  ");
				System.out.println(area(sc.nextDouble()));
				break;
			case '3':
				System.out.println("You chose circle \nEnter radius  ");
				System.out.println(area(sc.nextDouble()));
				break;
			case '4':
				System.out.println("You chose rectangle \nEnter base and height ");
				System.out.println(area(sc.nextDouble(),sc.nextDouble()));
				break;
			default:
				System.out.println("Wrong input");
				break;
		
		}
		
		sc.close();
	}
	static double area(double base , double height ,int shape) {
		return 0.5*base*height;
	}
	static double area(double side , int shape ) {
		return side*side;
	}
	static double area(double base , double height) {
		return base*height;
	}
	static double area(double r ) {
		return Math.PI*r*r;
	}

}
