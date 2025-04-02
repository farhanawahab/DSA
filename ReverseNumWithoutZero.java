//this code didn't pass in gfg, but it works:)
//without leading zeroes
public class ReverseNumWithoutZero {
    public static void main(String[] args) {
        int n=12345;
        while(n>0){
            int ld = n%10;
            if(ld != 0){
                System.out.print(ld);
            }
            n=n/10;
        }
    }
}
