public class FirstDigitOfNum {
    public static void main(String[] args) {
        int n = 54321;
        while(n>0){
            int ld = n%10;
            n = n/10;
            if(n==0){
                System.out.println(ld);
            }
        }
    }
}
