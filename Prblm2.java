import java.util.Scanner;
public class Prblm2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Input");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int sum = a+b+c;
        //conditional statement
        if(sum == 180){
            System.out.println("Triangle can be formed");
        }
        else {
            System.out.println("Triangle cannot be formed");
        }
    }
}
