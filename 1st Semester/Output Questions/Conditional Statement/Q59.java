public class Q59 {
    public static void main(String[] args) {
        
        String branch = "ECE";
        int semester = 1 ;
        switch (semester){
            case 1:
                System.out.println("ICP-CSE 1001");
                switch(branch){
                    case "ECE":
                        System.out.println("ECE is learning ICP");
                    case "CSE":
                    case "EE":
                        System.out.println("EE is learning ICP");
    
                }
            case 2:
            case 3:
            case 4: //Error correction 1 =>4
            default :
                System.out.println("Default");
        }
    }
}

// OUTPUT:-
// ICP-CSE 1001
// ECE is learning ICP
// EE is learning ICP
// Default