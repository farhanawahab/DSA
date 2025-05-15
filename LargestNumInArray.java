//find largest num in an array
public class LargestNumInArray {
    public static void main(String[] args) {
        int []arr = {2,15,28,35,100,58,20};
        int largestNum = arr[0];
        for(int i=1; i<arr.length; i++){
            if(largestNum < arr[i]){
                largestNum = arr[i];
            }
        }
        System.out.println(largestNum);
    }
}
