//print alternate from index 0
public class AlternatesInArray {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5};
        for(int i=0; i<arr.length;i+=2){
            System.out.print(arr[i]+" ");
        }
    }
}
