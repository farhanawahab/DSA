public class CountDigits {
    public static void main(String[] args) {
        int n= 54321356;
        int count = 0;
        while(n>0){
            count = count+1;
            n = n/10;
        }
        System.out.println(count);
    }
}
