import java.util.Scanner;
public class Fibonacii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number upto u need:");
        int n = sc.nextInt();
        System.out.println("Fibonacci series");
                fibon(n);

        System.out.println("Tribonacci series");
        tribo(n);
    }

        public static void fibon (int n){
            int f0 = 0;
            int f1 = 1;
            System.out.println(f0 + "\n" + f1);
            int f2 = 0;
            for (int i = 0; i < n; i++) {
                f2 = f1 + f0;
                System.out.println(f2);
                f0 = f1;
                f1 = f2;


            }
        }

    public static void tribo( int n){
        int t0 = 0;
        int t1 = 0;
        int t2=1;
        System.out.println(t0 + "\n" + t1+"\n"+t2);
        int t3 = 0;
        for (int i = 0; i < n; i++) {
            t3 = t1 +t0+t2;
            System.out.println(t3);
            t0 = t1;
            t1 = t2;
            t2= t3;


        }
    }
    }

