public class SumOfDigitsUsingRecursion {
    static int sumDigit(int n){
        if(n%10==n){
            return n;
        }else{
            int ld=n%10;
            return ld+sumDigit(n/10);
        }
    }

    public static void main(String[] args) {
        //int result = sumDigit(34534);
        System.out.print(sumDigit(34534));
    }
}
