import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Givenumber");
        int n = sc.nextInt();

        int sum = 0;
        int r;
        int temp;
        temp=n;

        while (n > 0) {
            r = n % 10;  //getting remainder
            sum = (sum * 10) + r;
            n = n / 10;
        }

        if (temp!= sum) {
            System.out.println("No");
        } else {
            System.out.println("yy0");
        }

    }
}
     /*
        n=456
        r=6;
        s=6;
        n=45;

        r=5;
        s=60+5=65;
        n=4;


       r=4;
        s=65*10+4;
        n=0

        */

