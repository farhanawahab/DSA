public class CheckNumIsPrime {
    public static void main(String[] args) {
        int n=25;
        if(n<=1){
            System.out.println("false");
        }
        for(int i=2; i<n; i++){
            if(n%i == 0){
                System.out.println("Not a prime");
            }
        }
    }
}
