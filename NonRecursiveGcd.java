public class NonRecursiveGcd {
    public static void main(String[] args) {
        int a=48, b=18;
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        System.out.println(a);
    }
}
