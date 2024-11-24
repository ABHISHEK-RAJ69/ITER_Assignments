public class Q2 {
    public static void main(String[] args) {
        boolean i=false,x=false,y=true;
        if(i=(x=i=y)){
            // i=(x=i=y) => i=y
            //i=(x=y) =>x=y
            //i=(y) => y
            // if(y)=> if(ture)
            System.out.println("bye");
        }else{
            System.out.println("hello");
            System.out.println("hi");
        }
    }
}
//OUTPUT :-
//  bye
// Vscode recomend to remove all variable and leave only y