package Assignment6;

import java.util.Scanner;

public class HQ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter three numbers ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        if (consecutive(a, b, c)) {
            System.out.println("Numbers are consecutive ");
        }else{
            System.out.println("Numbers are not consecutive ");

        }
        
    }
    static boolean consecutive(int a , int b , int c ){
        int min =Math.min(c,(Math.min(a, b)));
        int max=Math.max(c,(Math.max(a,b)));
        int mid =(a+b+c)-(min+max);
        if (mid == (min + max)/2 && min+2 == max) {
            return true;
        }
        return false;
    }
}

/*
Output:-
Enter three numbers 
85
86
84
Numbers are consecutive 
 */