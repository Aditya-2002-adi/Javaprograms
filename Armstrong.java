
import java.lang.Math;
public class Armstrong
{

    public static void  isArmstrong(int n)
    {
        int temp, digits=0, last=0, sum=0;
        temp=n;

        while(temp>0)
        {
        temp = temp/10;
        digits++;
        }

        temp = n;
        while(temp>0)
        {

        last = temp % 10;

        sum +=  (Math.pow(last, digits));

        temp = temp/10;
        }

        if(n==sum)

        {
            System.out.println("Yes");
        }

        else {
            System.out.println("no");
        };
        }

public static void main(String args[])
        {
        int num;

        System.out.println("Armstrong Number up to  are: ");
       isArmstrong(153);


        }
        }