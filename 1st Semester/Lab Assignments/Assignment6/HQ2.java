package Assignment6;

import java.util.Scanner;

public class HQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		 sc.close();
	}
	static double volume(double s) {
		System.out.println("volume of the cube is"+ s*s*s);
		return s*s*s;
	}
	static double volume(double l,double b , double h ) {
		System.out.println("volume of the cuboid is"+ l*b*h);
		return h*b*l;
	}
	static double volume(float r) {
		System.out.println("volume of the cube is"+ (4/3*Math.PI*r*r*r));
		return 4/3*Math.PI*r*r*r;
	}

}
