package assignement2_cmd_line_args;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		
		int min =Math.min(c,(Math.min(a, b)));
		int max=Math.max(c,(Math.max(a,b)));
		int mid =(a+b+c)-(min+max);
		System.out.println(min +" "+ mid +" "+max);

	}

}
