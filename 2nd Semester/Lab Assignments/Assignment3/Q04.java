package Assignment3;

public class Q04 {

	public static void main(String[] args) {
		Box<Integer> a = new Box<Integer>(5,7);
		Box<Integer> b = a;
		Box<String> c = new Box<String>("Rahul" , "Aman");
		Box<Object> k = new Box<Object>("Rahul ", 200);
		System.out.println(a.toString());
		b.n2 = 4;
		System.out.println(b.toString());
		System.out.println(a.toString());
		c.n2 = "Next";
		System.out.println(c.toString());
		System.out.println(k.toString());
	} 

}

class Box<T>{
	T n ;
	T n2;
	Box(T n ,T n2){
		this.n = n;
		this.n2 = n2;
	}
	@Override
	public String toString() {
		return "Box [n=" + n + ", n2=" + n2 + "]";
	}
	
	
	
}