public class ReverseNum {
    public static void main(String[] args) {
        int n= 543211;
        while(n>0){
            int ld = n%10;
            System.out.print(ld);
            n = n/10;
        }
    }
}
//Palindrome program can also be used for printing reverse of a number