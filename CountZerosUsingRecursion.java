public class CountZerosUsingRecursion {
    static int countZero(int n){
        //base case
        if(n%10==n){
            if(n%10==0){
                return 1;
            }else{
                return 0;
            }
        }
        //recursive step
        if(n%10==0){
            return 1+countZero(n/10);
        }else{
            return countZero(n/10);
        }
    }

    public static void main(String[] args) {
        int result = countZero(2003008);
        System.out.print(result);
    }
}
