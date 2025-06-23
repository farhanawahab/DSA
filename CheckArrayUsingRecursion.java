//check whether an array is sorted or not
public class CheckArrayUsingRecursion {
    static boolean checkSorted(int []a, int n, int i){
        if(i>=n-1){
            return true;
        }
        if(a[i]>a[i+1]){
            return false;
        }
        return checkSorted(a,n,i+1);
    }

    public static void main(String[] args) {
        int []a = {1,5,3,4,5};
        System.out.print(checkSorted(a,5,0));
    }
}
