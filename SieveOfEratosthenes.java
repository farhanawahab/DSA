public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n=30;
        int[] a = new int[n + 1];
        for(int i=2; i<Math.sqrt(n); i++){
            if(a[i]==0){
                for(int j=i*2; j<=n; j=j+i){
                    a[j]=1;
                }
            }
        }
        for(int i=2; i<=n; i++){
            if(a[i]==0){
                System.out.print(i+" ");
            }
        }
    }
}
