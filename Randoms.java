import java.lang.Math;
import java.util.Random;
 class Randoms {
    public static void main(String[] args) {
        System.out.println("Mathrandom "+Math.random());

Random random=new Random();
        int x = random.nextInt(50);//we can put double float etc
        System.out.println(x);

 double y=Math.floor(random.nextInt(70)+1);
        System.out.println(y);
 }


    }

