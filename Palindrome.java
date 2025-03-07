public class Palindrome {
    public static void main(String[] args) {
        int n = 12321;
        int originalNum = n;
        int sum = 0;
        while(n>0){
            int ld = n%10;
            sum = sum*10+ld;
            n = n/10;
        }
        System.out.println(sum);
        //The above program can be used for reversing a number too
        if(sum == originalNum){
            System.out.println("It is a Palindrome");
        }else{
            System.out.println("It is not a Palindrome");
        }
    }
}
