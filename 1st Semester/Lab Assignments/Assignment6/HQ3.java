package Assignment6;

public class HQ3 {
    public static void main(String[] args) {
        String s = "Helio0";
        System.out.println(s.charAt(middle(s)));
        
    }
    static int middle(String s){
        int l = s.length();
        return ((l %2 == 0)? l/2 : l/2);
    }

}
/*
Output :-

i
*/
