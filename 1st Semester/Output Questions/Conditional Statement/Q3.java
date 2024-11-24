public class Q3 {
    public static void main(String[] args) {
        boolean i = false;
        if(!i && i == true){//i is not equal to true so the condition fails and fo to else .
            System.out.println("bye ");
        }else{
            System.out.println("hello");
            System.out.println(i);
        }
    }
}
    // OUTPUT:
        // hello
        // false