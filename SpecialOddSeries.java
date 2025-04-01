public class SpecialOddSeries {
    public static void main(String[] args) {
        int n=2;
        int sum=0, seriesSum=0;
        for(int i=1; i<=(2*n-1); i=i+2){
            sum = sum+i;
            seriesSum = seriesSum+sum;
        }
        System.out.println(seriesSum);
    }
}
