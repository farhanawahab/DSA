public class SpecialSeries {
    public static void main(String[] args) {
        int n=15;
        int sum=0, seriesSum=0;
        for(int i=1; i<=n; i++){
            sum=sum+i;
            seriesSum=seriesSum+sum;
        }
        System.out.println(seriesSum);
    }
}
