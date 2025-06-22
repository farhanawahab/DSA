//find the divisors of a number using recursion
public class FindDivisorsUsingRecursion {
    static int findDivisor(int n, int i){
        if(i==n){
            return i;
        }
        //recursive step
        if(n%i==0){
            System.out.print(i+" ");
        }
        return findDivisor(n,i+1);
    }

    public static void main(String[] args) {
        System.out.print(findDivisor(12,1));
    }
}
