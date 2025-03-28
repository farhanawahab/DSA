//it is a brute-force approach. we have to optimise this code, only then it can run.
public class TrailingZeros {
    public static void main(String[] args) {
        int n=5;
        int fact=1;
        int count = 0;
        for(int i=1; i<=n; i++){
            fact = fact*i;
        }
        while(fact>0){
            if(fact%10 == 0){
                count++;
                fact = fact/10;
            }
        }
        System.out.println(count);
    }
}
