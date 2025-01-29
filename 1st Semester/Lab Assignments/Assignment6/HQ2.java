package Assignment6;

import java.util.Scanner;

public class HQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		// ** NOTE ** 
		//  Same name different numbar of arguments = method over load .
		System.out.println("Enter your choice");
		System.out.println("1 for Cube ");
		System.out.println("2 for Sphere ");
		System.out.println("3 for Cuboide ");

		switch (sc.nextInt()) {
			case 1:
				System.out.println("Enter side of the cube");
				System.out.println(volume(sc.nextDouble()));
				break;
			case 2:
				System.out.println("Enter radius of the Sphere ");
				System.out.println(volume(sc.nextFloat()));
				break;
			case 3:
				System.out.println("Enter length breadth and height of the cuboide ");
				System.out.println(volume(sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
			default:
				System.out.println("Wrong input");
				break;
		}
		 sc.close();
	}
	static double volume(double s) {
		System.out.println("volume of the cube is "+ s*s*s);
		return s*s*s;
	}
	static double volume(double l,double b , double h ) {
		System.out.println("volume of the cuboid is "+ l*b*h);
		return h*b*l;
	}
	static double volume(float r) {
		System.out.println("volume of the cube is "+ (4/3*Math.PI*r*r*r));
		return 4/3*Math.PI*r*r*r;
	}

}

/*
Output:-
Enter your choice
1 for Cube 
2 for Sphere
3 for Cuboide
2
Enter radius of the Sphere 
5
volume of the cube is 392.69908169872417
392.69908169872417
 */