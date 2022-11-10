import java.lang.Math;
import java.math.BigInteger;

public class BigIntegerC {
    public static void main(String[] args) {
     int b=10;
        BigInteger f=new BigInteger("1");
        for(int i=2;i<=10;i++){
            BigInteger m=BigInteger.valueOf(i);
            f=f.multiply(m);
            //f.add
            //f.sub
        }
        System.out.println(f);

        System.out.println("Fibonacci serqies using Biginter");
int n=100;
        BigInteger f1=BigInteger.valueOf(0);
        BigInteger f2=BigInteger.valueOf(1);
        BigInteger f3=  BigInteger.valueOf(1);
        for(int i=2;i<=n;i++){
            f3=f1.add(f2);
           f1=f2;
           f2=f3;
            System.out.println(i+"th term :" +f2+ "  ");

        }
        System.out.println("Check prime or not..");
        int nn=2;
        BigInteger k=BigInteger.valueOf(nn);
        System.out.println(k.isProbablePrime(1));
        //in built function

        System.out.println("Next primse ");
        String a=k.nextProbablePrime().toString();
        System.out.println(" "+a);
        System.out.println("Convertig string into integer");
        System.out.println(Integer.parseInt(a));


    }
}
