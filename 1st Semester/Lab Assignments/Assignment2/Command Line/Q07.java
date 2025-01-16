
public class Q07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= Integer.parseInt(args[0]);
		int b= Integer.parseInt(args[1]);
		int c= Integer.parseInt(args[2]);
		boolean ans =(a<=b*c)? true : (b<=a*c)? true :(c<=a*b)? true : false ;
		System.out.println(ans);
	}

}
