import java.util.*;

public class test {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter a choice (1-3):");
        String input = s.nextLine();

        switch (input) {
            case "1":
                System.out.println("Excellent choice!");                
                break;

            case "2":
                System.out.println("Okay choice...");
                break;

            case "3":
                System.out.println("Terrible choice!");
        
            default:
                System.out.println("Not a valid selection");
                break;
        }

        s.close();
    }

}
