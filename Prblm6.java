import java.util.Scanner;
public class Prblm6 {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.println("Enter the value of x:");
        int x = scan.nextInt();
        for(int i=x; i<=1000; i=i+x){
            System.out.println(i);
        }
    }
}
