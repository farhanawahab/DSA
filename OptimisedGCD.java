//Optimised approach for finding gcd
public class OptimisedGCD {
    public static void main(String[] args) {
        int a=25, b=50;
        System.out.println(gcd(a,b));
    }
    public static int gcd(int a,int b){
        if(b==0){
            return a;
        }else{
            return gcd(b, a%b);
        }
    }
}
