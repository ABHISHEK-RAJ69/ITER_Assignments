import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no. for which you want to find the multiplication table: ");
		int x =sc.nextInt();
		System.out.println("The multiplication table of 8 is: ");
		for(int i = 1;i<=10;i++) {
			System.out.println(x+" "+((char)(215))+" "+i+" = "+x*i);
		}
		sc.close();
	}

}
