//Optimised approach
public class PrimeNumber {
    public static void main(String[] args) {
        int n=9;
        int flag=0;
        for(int i=2; i<Math.sqrt(n); i++){
            if(n%i==0){
                flag=1;
                System.out.println("Not a Prime");
            }
        }
        if(flag==0){
            System.out.println("Prime");
        }
    }
}
