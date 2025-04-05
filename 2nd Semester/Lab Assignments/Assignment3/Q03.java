package Assignment3;

public class Q03 {

	public static void main(String[] args) {
		Student a = new Student();
		if(a.marks >100) {
			
			try {
				throw new MarksOutOfBoundException("Marks is invalid");
			}catch (MarksOutOfBoundException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Congrats");
		
	}

}
class Student {
	double marks=102;
	String name ="Rahul";
	
}
class MarksOutOfBoundException extends Exception{
	MarksOutOfBoundException(String m){
		super(m);
	}
	
}