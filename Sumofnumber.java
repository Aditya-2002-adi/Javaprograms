public class Sumofnumber {
    public static void main(String[] args) {
        int n=123;
        int sum=0;

        while(n>0){
           int m=n%10;
            sum=sum+m;
           n=n/10;

        }
        System.out.println(sum);

        System.out.println("Sum of natural numers");
        int s=0;

        for(int i=1;i<=10;i++){

            s=s+i;//we can use n*(n+1)/2
        }
        System.out.println(s);
    }
}
