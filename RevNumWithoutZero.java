//reverse a num without leading zeroes
public class RevNumWithoutZero {
    public static void main(String[] args) {
        int n=123456;
        int rev = 0;
        while(n>0){
            int ld = n%10;
            rev = rev*10+ld;
            n=n/10;
        }
        System.out.print(rev);
    }
}
