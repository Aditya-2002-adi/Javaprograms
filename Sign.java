import java.lang.Math;
public class Sign {
    public static void main(String[] args) {
        int result;
        int n=10;
        result= (int) Math.signum(n);
        if(result==1){
            System.out.println("positive");
        }
        else
            System.out.println("neigitive");

    }
    }
