public class SumOfFirstAndLastDigits {
    public static void main(String[] args) {
        int N = 12345;
        if(N<10){
            System.out.println(N);
        }else{
            int lastDigit = N % 10;
            int firstDigit=N;
            while(firstDigit>=10){
                firstDigit=firstDigit/10;
            }
            System.out.println(firstDigit+lastDigit);
        }
    }
}
