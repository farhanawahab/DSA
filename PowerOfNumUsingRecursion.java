//find the power of a number
public class PowerOfNumUsingRecursion {
    static int power(int A, int B, int i){
        if(i>=B){
            return A;
        }
        return A*power(A,B,i+1);
    }

    public static void main(String[] args) {
        System.out.print(power(5,2,1));
    }
}
