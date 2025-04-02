public class CountPerfectSquares {
    public static void main(String[] args) {
        int n=49;
        int count=0;
        for(int i=1; i<=Math.sqrt(n); i++){
            if(i*i < n){
                count++;
            }else{
                break;
            }
        }
        System.out.println(count);
    }
}
