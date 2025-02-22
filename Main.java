import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your Input:");
        int num = scan.nextInt();
        String name = scan.next();
        String y = scan.next();

        //print
        System.out.println(num);
        System.out.println(name);
        System.out.println(y);
    }
}
