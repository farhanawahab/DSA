public class ReverseNum {
    public static void main(String[] args) {
        int n= 543211;
        while(n>0){
            int ld = n%10;
            System.out.println(ld);
            n = n/10;
        }
    }
}
