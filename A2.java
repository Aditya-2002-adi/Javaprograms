import java.util.HashSet;
public class A2 {
    public static void main(String[] args) {

        int[] arr = {1, 0, 3, 4, 2, 10, 8, 8, 3};

        duplicate(arr);
        odd(arr);
        even(arr);
        largest(arr);
        min(arr);
        sort(arr);
        Thirdlargesort(arr);
        secondlargesort(arr);
        Removeduplicate(arr);
        removehash(arr);
        System.out.println("Kth position greatest");
        kthpositionelement(arr);
    }
    public static void duplicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[j]);
                }
            }
        }
    }
    public static void odd(int[] arr) {
        System.out.println("even");

        for (int j = 0; j < arr.length; j++) {
            if (j % 2 == 0) {
                System.out.println(arr[j]);
            }
        }
    }


    public static void even(int[] arr) {
        System.out.println("odd");
        for (int i = 0; i < arr.length; i++) {

            if (i % 2 != 0) {
                System.out.println(arr[i]);
            }


        }

    }

    public static void largest(int[] arr) {
        int max = 0;
        System.out.println("Maximium");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {

                max = arr[i];
            }
        }
        System.out.println(max);
    }

    public static void min(int[] arr) {
        int min = 0;
        System.out.println("Minimum");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {

                min = arr[i];
            }
        }
        System.out.println(min);
    }


    public static void sort(int[] arr) {
        System.out.println("Ascending order");
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

    }
    public static void Thirdlargesort(int[] arr) {
        System.out.println("Ascending order");
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        System.out.println("3rd largest element" + arr[arr.length - 3]);

    }
    public static void secondlargesort(int[] arr) {
        System.out.println("second element order");
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        System.out.println("2rd largest element" + arr[arr.length - 2]);

    }
    public static void  Removeduplicate(int[] arr) {
        int[] a={1,1,2,3,4,5,6,7,7,7};
        System.out.println();
        System.out.println();
        System.out.println("-----Remove elements: ");// for sorted array

        int j = 0;
        System.out.println("Original array");
        for (int i = 0; i < a.length - 1; i++) {
            System.out.print(" "+a[i]);

        }
        System.out.println("removed duplicated");
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i + 1]) {
              a[j] = a[i];
                j++;
            }
        }
    a[j]=a[a.length-1]; //to put last elemet

        for (int i = 0; i <=j; i++) {  // till j updated values
            System.out.print(" "+a[i]);
        }

    }

    public static  void removehash(int []arr){
        System.out.println( );
        System.out.println("HASHSET Doesnt take duplicate elements");
        HashSet<Integer> hs=new HashSet<Integer>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }

for(int n:hs){  //for each loop
    System.out.println(n+" ");
}

    }
    public  static void   kthpositionelement(int[] arr){
        System.out.println("Kthelemet");
        int temp=0;
        int k=2;
        for(int i=0;i< arr.length-1;i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {

                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

         if(i==k-1)
            {
                System.out.println("Largest"+ arr[i]);
                break;
            }
        }

        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
