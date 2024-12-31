import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to my calculator");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the sign of the operation you want to perfome :-");
		System.out.println(" \" + \" for Addition ");
		System.out.println(" \" - \" for Addition ");
		System.out.println(" \" * \" for Addition ");
		System.out.println(" \" / \" for Addition ");
		System.out.println(" \" % \" for Addition ");
		System.out.println(" \" sq\" for Addition ");
		System.out.println("Enter -1  to exit ");
		while(true){
			System.out.println("Enter your choice :- ");
			String choice =sc.next();
			System.out.println("Enter two numbers :- ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(choice.equals("-1")) {
				break;
			}
			if(choice.equals("+")) {
				System.out.println(additionSimple(a, b));
			}
			if(choice.equals("-")) {
				System.out.println(subtractionSimple(a, b));
			}
			if(choice.equals("*")) {
				System.out.println(multiplicationSimple(a, b));
			}
			if(choice.equals("/")) {
				System.out.println(divisionSimple(a, b));
			}
			if(choice.equals("%")) {
				System.out.println(remainderSimple(a, b));
			}
			if(choice.equals("sq")|| choice.equals("SQ")) {
				System.out.println(squareRootSimple(a));
			}
			else {
				System.out.println("Wrong input");
			}
		}
		sc.close();
		}
	public static int additionSimple(int x , int y) {
		return x+y;
	}
	public static int subtractionSimple(int x , int y) {
		return y-x;
	}
	public static int multiplicationSimple(int x , int y) {
		return x*y;
	}
	public static int divisionSimple(int x , int y) {
		return (x==0)? 0 : y/x;
	}
	public static int remainderSimple(int x , int y) {
		return (x==0)? 0 : x % y;
	}
	public static double squareRootSimple(int x ) {
		return (x < 0)? -1.0 : Math.sqrt(x) ;
	}
	

}

/*
Output:-
Welcome to my calculator
Enter the sign of the operation you want to perfome :-
 " + " for Addition 
 " - " for Addition 
 " * " for Addition 
 " / " for Addition 
 " % " for Addition 
 " sq" for Addition 
Enter -1  to exit 
Enter your choice :- 
/
Enter two numbers :- 
100
1000
10
Wrong input
Enter your choice :- 
*/