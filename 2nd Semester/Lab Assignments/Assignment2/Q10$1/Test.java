package Assignment2.Q10$1;

public class Test extends Student{
    int mark1;
    int mark2;
    void inputDetails(String name , int roll ,int mark1, int mark2) {
        super.inputDetails(name, roll);;
        this.mark1 = mark1;
        this.mark2 = mark2;
    }
    void showDetails(){
        System.out.println("mark1 = "+this.mark1 );
        System.out.println("mark2 = "+ this.mark2);
    }

    
}
