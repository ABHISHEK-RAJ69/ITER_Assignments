public class HQ1 {

    public static void main(String[] args) {
        int sqrsum =0, sum =0;
        for (int i= 1; i<=10;i ++){
            sum+=i;
            sqrsum +=(i*i);
        }
System.out.println("The sum of the squares of the first ten natural numbers is: "+sqrsum);

        System.out.println("The square of the sum of the first ten natural numbers is : "+(sum*sum));

        System.out.println("The difference between the sum of the squares of the first ten natural numbers and the square of the sum is "+ (sum*sum) +" - "+(sqrsum)+" = "+((sum*sum)-sqrsum));
    }
}
// Output:-

// The sum of the squares of the first ten natural numbers is: 385
// The square of the sum of the first ten natural numbers is : 3025
// The difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 - 385 = 2640