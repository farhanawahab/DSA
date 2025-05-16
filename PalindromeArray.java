//check whether the array is palindrome or not
public class PalindromeArray {
    public static void main(String[] args) {
        int [] arr={1,2,3,2,2};
        int i=0;
        int j= arr.length-1;
        int flag=1;
        while(i<j){
            if(arr[i]!=arr[j]){
                flag=-1;
            }
            i++;
            j--;
        }
        if(flag==1){
            System.out.println("Palindrome Array");
        }else{
            System.out.println("Not a Palindrome Array");
        }
    }
}
