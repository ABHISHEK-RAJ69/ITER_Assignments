package Assignment6;

import java.util.Scanner;;
public class HQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string ");
        String str = sc.nextLine();
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (checkRepeat(str, str.charAt(i), i)) {
                System.out.print(str.charAt(i));
                System.exit(0);
            }
            
        }  
        System.out.println("All charachters are reapeted");
        sc.close();  
    }
    static boolean checkRepeat(String str, char a , int index){
        for (int i = 0; i < str.length(); i++) {
             if (str.charAt(i) == a) {
                if (i != index) {
                    return false;
                }
             }
        }


        return true;
    }

}
/*
Output:-

Enter a string 
Java
j
 */