//printing elements of an array by getting all the inputs from the user
import java.util.Scanner;
public class ArrayInputFromUser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = scan.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("The output is: ");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}
