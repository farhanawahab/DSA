public class KthDigitOfPower {
    public static void main(String[] args) {
        int A,B,K;
        A=5;
        B=2;
        K=3;
        long power = (long)Math.pow(A,B);
        System.out.println(power);
        //Kth digit
        int i=1;
        while(power>0){
            long ld = power%10;
            if(K==i){
                System.out.println(ld);
            }
            i++;
            power = power/10;
        }
        System.out.println("0"); //if K!=i , then this line will be executed
    }
}
