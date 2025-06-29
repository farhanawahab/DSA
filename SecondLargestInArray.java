//find the second largest element in an array
public class SecondLargestInArray {
    public static void main(String[] args) {
        int []a ={8,6,9,4,2,3,4};
        int max = -1;
        for(int i=0; i<a.length; i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        //second largest
        int max2 = -1;
        for(int i=0; i<a.length; i++){
            if(a[i]>max2 && a[i]!=max){
                max2=a[i];
            }
        }
        System.out.print(max2);
    }
}
