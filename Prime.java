import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        System.out.println("Print prime number upto n limit");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag = 0;
for(int i=1;i<=n;i++){
    for(int j=2;j<=i-1;j++){
        if(i%j==0){
            flag=flag+1;
        }
    }
    if(flag==0){
        System.out.println(i);
    }
    else{
       flag=0;
    }
        }
    }
}

