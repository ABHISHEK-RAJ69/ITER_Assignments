import java.util.Scanner;

public class Q08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int guess;
		while(true) {
			int random = 1+ (int)(Math.random()*(10));
			System.out.println("Enter your guess");
			guess = sc.nextInt();
			System.out.println("Computer gusee: "+random);
			if(guess>random) {
				System.out.println("Too high, try again");
			}else if (guess< random) {
				System.out.println("Too low , try again");
			}else {
				System.out.println("Good guess");
				break;
			}
		}
		sc.close();
	}

}
