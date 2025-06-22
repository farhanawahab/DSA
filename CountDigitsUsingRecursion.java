public class CountDigitsUsingRecursion {
    static int countDigit(int n){
        if(n%10==n){
            return 1;
        }else{
            return 1+countDigit(n/10);
        }
    }

    public static void main(String[] args) {
        int result = countDigit(3422);
        System.out.print(result);
    }
}
