//given a range [L,R], find sum of all prime num using sieve
public class SumOfPrimeNumUsingSieve {
    public static void main(String[] args) {
        int L=10,R=20;
        int sum=0;
        int[] a = new int[R+1];
        for(int i=2; i<=Math.sqrt(R); i++){
            if(a[i]==0){
                for(int j=i*i; j<=R; j=j+i){
                    a[j]=1;
                }
            }
        }
        for(int i=L; i<=R; i++){
            if(a[i]==0){
                sum = sum+i;
            }
        }
        System.out.println(sum);
    }
}
