public class ReverseNum {
    public static void main(String[] args) {
        int n= 543211;
        int count = 0;
        while(n>0){
            //int ld = n%10;
            //System.out.println(ld);
            count = count+1;
            n = n/10;
        }
        System.out.println(count);
    }
}
