public class FactorialUsingRecursion {
    static int fact(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 6;
        //FactorialUsingRecursion obj = new FactorialUsingRecursion();  //used when fact(n) is not static
        int result = fact(n);
        System.out.print(result);
    }
}