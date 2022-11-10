
public class Searching {
    public static void main(String[] args) {
        int[] a = {100, 21, 3, 4, 51, 67, 8};
      Linearsearch(a);
        Binarysearch(a);

        Bubblesort(a);
        Selctionsort(a);
        Insertionsort();
    }

    public static void Linearsearch(int[] a) {
        int key = 8;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                System.out.println("found at postion: " + (i + 1) + " value  " + a[i]);
            }
        }
    }



    public static void Binarysearch(int[] a) {
        System.out.println("Binary serach using last first middle elements");

       int arr[]={1,2,3,4,5,6,7,8,9};
       int m=(arr.length)/2;
       int f=0;
       int l=arr.length-1;
       int item=10;
       while(f<=l)
       {
           if(arr[m]==item){
               System.out.println("Element found at: "+(m+1)+" "+arr[m]);
               break;
           }
        else if(arr[m]>item)
           {
               l=m-1;
           }
        else if(arr[m]<item){
            f=m+1;
        }
        else{
           System.out.println("Element nor found:");
       }
        m=(l+f)/2;
        }
    }


    public static void Bubblesort(int[] a) {
        System.out.println("sorting by using rounds like j and i :");
        for (int i = 0; i < a.length; i++) {
            int t=0;
            for (int j = 0; j < a.length-1; i++) {
                if(a[j]>a[j+1]){
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }


            }
        }
    }

public static void Selctionsort(int[] a) {
    System.out.println("i Selection sort t have sorted and unsorted array " +
            "and it takes comparision of  1st and next elements:");
    int min;
    int temp=0;
    for (int i = 0; i < a.length; i++) {
        min=i; // not to  changing values of the min
        for(int j=i+1;j<a.length;j++){
            if(a[j]<a[min]){
                min=j;
            }
        }
        temp=a[i];
        a[i]=a[min];
        a[min]=temp;
    }
    for (int i = 0; i < a.length; i++) {
        System.out.println(a[i]);
    }
    }


public static void Insertionsort() {

   int[] ar={9,1,3,4,10};
   int j,tm;
   for(int i=1;i<ar.length;i++){

       tm=ar[i];
       j=i;
       while(j>0 && ar[j-1]>tm) // previous value greater than i value swap it and check all previous values..
       {
           ar[j]=ar[j-1];
           j=j-1;
       }
       ar[j]=tm;
    }
    for (int i = 0; i < ar.length; i++) {
        System.out.print(ar[i]+"  ");
    }
}



}
