public class FibonacciUsingRecursion {
    static int fib(int n){
        if(n<=1){
            return n;
        }else{
            return fib(n-1)+fib(n-2);
        }
    }

    public static void main(String[] args) {
        int result = fib(0);
        System.out.print(result);
    }
}
