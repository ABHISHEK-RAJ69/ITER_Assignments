public class HQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(args[0]);
		int sum = 0 ;
		sum+=a%10;
		a/=10;
		a/=10;
		a/=10;
		sum+=a;
		System.out.println(sum);

	}

}
