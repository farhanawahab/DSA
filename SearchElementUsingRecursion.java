//search for an element from an array using a target value
public class SearchElementUsingRecursion {
    static int search(int []a, int n, int i, int target){
        if(i>=n){
            return -1;
        }
        if(a[i]==target){
            return i;
        }else{
            return search(a,n,i+1,target);
        }
    }

    public static void main(String[] args) {
        int []a = {1,22,3,4,54,5663,322};
        System.out.print(search(a,7,0,22));
    }
}
