package Assignment7;

import java.util.Arrays;
import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter the size of the array");
        int l = sc.nextInt();
        int[] list = new int[l];
        for (int i = 0 ; i < l ; i++){
            list[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(Arrays.toString(list));
        pass(list, l-1);
        pass(list, l-2);
        for(int i = l-2 ; i >=0 ; i--){
            if (chekDuplicate(list, i, i+1)) {
                pass(list, i-1);
                continue;
            }else{
                System.out.println("Second largest number is "+list[i]);
                System.out.println(Arrays.toString(list));
                System.exit(0);
                break;
            }

        }
        System.out.println("All elements are equal ");

    }
    static void pass( int[] list , int end){
        for (int i = 0; i < end; i++) {
            if ( list [i]> list [i+1]){
                swap(list , i ,i+1);
            }
        }
    }
    static void swap (int[] list , int f , int s ){
        int temp = list[s];
        list[s] = list [f];
        list [f] = temp;
    }
    static boolean chekDuplicate(int[] list , int o ,int t ){
        return (list[o] == list[t]? true :false);
    }


}

/*
Output :-
Enter the size of the array
6
99
8
99
87
54
5
[99, 8, 99, 87, 54, 5]
Second largest number is 87
[8, 54, 5, 87, 99, 99]
 */