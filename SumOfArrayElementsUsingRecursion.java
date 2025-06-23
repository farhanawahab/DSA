//add the elements of an array using recursion
public class SumOfArrayElementsUsingRecursion {
    static int sum(int []a, int n, int i){
        if(i>=n){
            return 0;
        }
        return a[i] + sum(a,n,i+1);
    }

    public static void main(String[] args) {
        int []a={1,2,3,4,5};
        System.out.print(sum(a,5,0));
    }
}
