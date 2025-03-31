public class MiddleOfThreeNumbers {
    public static void main(String[] args) {
        int a=256, b=100, c=58;
        //a is middle number
        if((a>b && a<c) || (a>c && a<b)){
            System.out.println(a);
        }else if((b>a && b<c) || (b>c && b<a)){
            System.out.println(b);
        }else{
            System.out.println(c);
        }
    }
}
