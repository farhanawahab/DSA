import java.util.Scanner;
public class Prblm7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String firstName = scan.next();
        System.out.println("Enter your last name:");
        String lastName = scan.next();
        System.out.println("Enter the value of n:");
        int num = scan.nextInt();
        String fullName = firstName+lastName;
        //for loop
        for(int i=0; i<num; i++){
            System.out.println(fullName);
        }
    }
}
