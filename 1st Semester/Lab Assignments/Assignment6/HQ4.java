package Assignment6;

public class HQ4 {
    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog.";
        System.out.println("Number of words in the string : " +count(s));
    }
    static int count(String s ){
        int count =1 ;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' && s.charAt(i+1) != ' ') {
                count++;
            }
            
        }
        return count;
    }

}

/*
Output :-
Number of words in the string : 9
 */