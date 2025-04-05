package Assignment3;

public class Q02 {

	public static void main(String[] args) {
		
		String[] colors = new String[3];
		colors[0] = "Purple";
		colors[1] = "Neon";
		for(int i = 0 ; i < colors.length+1 ; i++) {
			try {
				System.out.println(colors[i]);
				
			}catch(ArrayIndexOutOfBoundsException e)  {
				System.out.println("u dont have enough color");
				
			}catch(NullPointerException e) {
				System.out.println("Pointer is pointing toward nothing");
			}
		}
		
	}

}
