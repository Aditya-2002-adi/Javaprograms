public class Mergearrays {
    public static void main(String[] args) {
        int[]a ={11,32,13,43};
        int b[]={95,36,7,91};
        int n =a.length+b.length;
        int c[]=new int[n];
        for(int i=0;i<a.length;i++){
            c[i]=a[i];
        }
        for(int i=0;i<b.length;i++){
            c[a.length+i]=b[i];

        }
        for(int i=0;i<n;i++){
            System.out.println(c[i]);
        }

    }
}
