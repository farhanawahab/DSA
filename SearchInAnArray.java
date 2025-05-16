//searching an element in an array and printing its index value.
//if the x value is not found in the array, then it prints -1
public class SearchInAnArray {
    public static void main(String[] args) {
        int []arr={11,23,45,67,89,189};
        int x=189, flag=-1;
        for(int i=0; i<arr.length;i++){
            if(arr[i] == x){
                flag=i;
            }
        }
        System.out.println(flag);
    }
}
