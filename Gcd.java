//brute force approach
public class Gcd {
    public static void main(String[] args) {
        int a=3, b=6;
        int gcd=1;
        for(int i=2; i<=Math.min(a,b); i++){
            if(a%i==0 && b%i==0){
                gcd=i;
            }
        }
        System.out.println(gcd);
    }
}
