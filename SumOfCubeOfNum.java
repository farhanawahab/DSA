public class SumOfCubeOfNum {
    public static void main(String[] args) {
        int n=5;
        int sum=0;
        for(int i=1; i<=n; i++){
            sum = sum + (i*i*i); //for fifth power put sum=sum+(i*i*i*i*i);
        }
        System.out.println(sum);
    }
}
