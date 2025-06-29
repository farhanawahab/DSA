import java.util.Arrays;

public class ThirdLargestElementInArray {
    public static void main(String[] args) {
        int []a = {22,3,4,5,10,15};
        Arrays.sort(a);
        System.out.print(a[a.length-3]);
    }
}
