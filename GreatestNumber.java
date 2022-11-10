public class GreatestNumber {
    public static void main(String[] args) {
        int a=10;
        int b=2;
        int c=12;
        int t;
        t=a>b?a:b;

        int t1;
        t1=c>t?c:t;

        System.out.println(t1);

        int n1=c>(a>b?a:b)?c:(a>b?a:b);

        System.out.println(n1);


        System.out.println("Wecan use else if ladder also ....");
    }
}
