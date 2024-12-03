package assignement2_cmd_line_args;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int dividend =Integer.parseInt(args[0]);
			int divisor=Integer.parseInt(args[1]);
			System.out.println("Quotient = " +(dividend/divisor));
			System.out.println("Remainder = "+(dividend%divisor));
	}

}
