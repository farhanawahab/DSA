public class PrimeNumberTillN {
    public static void main(String[] args) {
        int n = 9;
        for(int x=2; x<=n; x++){
            int flag = 0;
            for(int i=2; i<x; i++){  //here we shouldn't give i<=x, then the num-x will be divisible by itself(num-x)
                if(x%i == 0){
                    flag=1;
                }
            }
            if(flag==0){
                System.out.println(x);
            }
        }
    }
}
