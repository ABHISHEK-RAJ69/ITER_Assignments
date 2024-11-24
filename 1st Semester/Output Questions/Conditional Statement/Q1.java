public class Q1{
    public static void main(String[] args) {
        boolean i;
        if (i=(true,false,true)){  //Syntax error on token "=", Name expected after this token
            System.out.println("bye");
        }else{
            System.out.println("hello");
            System.out.println("hi");
        }

    }
}
// OUTPUT :-
//     Syntax ERROR at line 4
//     if (i=(true)) => if (true)