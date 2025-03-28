public class CheckNumIsPrime {
    public static void main(String[] args) {
        int n=77;
        int flag=0;
        /*if(n<=1){
            System.out.println("Not a Prime number");
        }*/
        for(int i=2; i<n; i++){
            if(n%i == 0){
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("It is a Prime number");
        }else{
            System.out.println("Not a Prime number");
        }
    }
}
