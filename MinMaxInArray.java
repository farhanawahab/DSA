//find max and min element in an array
public class MinMaxInArray {
    public static void main(String[] args) {
        int []a = {1,22,34,56,789};
        int min = a[0];
        int max = a[0];
        for(int i=1; i<a.length; i++){
            if(min > a[i]){
                min = a[i];
            }
            if(max < a[i]){
                max = a[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
