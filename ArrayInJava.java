//declaration of an array
public class ArrayInJava {
    public static void main(String[] args) {
        int [] arr = new int[5];
        arr[0] = 2;
        arr[2] = 4;
        System.out.println(arr[0]);
        System.out.println(arr[4]); //here for arr[4], no value is assigned so it gives us a garbage value in the output
    }
}
