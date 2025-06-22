public class PrintAllElementsUsingRecursion {
    static void printElements(int []a, int n, int i){
        if(i>=n){
            return;
        }
        System.out.print(" "+a[i]);
        printElements(a,n,i+1);
    }

    public static void main(String[] args) {
        int[]a = {1,2,3,4,5};
        printElements(a,5,0);
    }
}
