package Assignment3;

public class Q06 {

	public static void main(String[] args) {
		Integer[] a = new Integer[]{1,2,3,4,1,2,1,1};
		System.out.println(count(a,1));

	}
	public static <T> int count(T[] array, T item) {
		int count = 0 ;
		for(T x : array) {
			if (x == item) {
				count++;
			}
		}
		return count;
	}

}
