
public class twodarrays {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {3, 5, 6}};
        int[][] brr = {{1, 1, 3}, {7, 5, 6}, {8, 5, 6}};

        comparearrays(arr, brr);
        printarrays(arr, brr);
        lowertriangle();
        uppertriangle();
        sumrowandcols(arr);
        tranpose(arr);
        identity(arr);
    }

    public static void comparearrays(int[][] a, int[][] b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(" " + a[i][j]);
            }
            System.out.println();
        }
        System.out.println(".....................................");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(" " + b[i][j]);
            }
            System.out.println();
        }
    }

    public static void printarrays(int[][] a, int[][] b) {
        System.out.println(".....................................");
        System.out.println("Comparing 2 arrays");
        System.out.println("add/sub");
        int c[][] = new int[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                c[i][j] = b[i][j] + a[i][j];
            }
            System.out.println();
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(" " + c[i][j]);
            }
            System.out.println();
        }
    }

    public static void lowertriangle() {
        System.out.println("Lower trinagle");

        int[][] aa={{1, 1, 3}, {7, 5, 6}, {8, 5, 6}};
        for (int i = 0; i < aa.length; i++) {
            for (int j = 0; j < aa.length; j++) {
                if (j > i) {
                    aa[i][j] = 0;

                    System.out.print(" " + aa[i][j]);
                } else {
                    System.out.print(" " + aa[i][j]);
                }

            }
            System.out.println();
        }

    }

    public static void uppertriangle() {
        int[][] bb={{1, 1, 3}, {7, 5, 6}, {8, 5, 6}};
        System.out.println("Upper trinagle");
        for (int i = 0; i < bb.length; i++) {
            for (int j = 0; j < bb.length; j++) {
                if (i > j) {
                    bb[i][j] = 0;
                    System.out.print(" " + bb[i][j]);
                } else {
                    System.out.print(" " + bb[i][j]);
                }

            }
            System.out.println();
        }
    }

    public static void sumrowandcols(int[][] a) {
        System.out.println("Sumrows");
        System.out.println();
        int [][]e={{1,2,3},{1,1,1},{1,2,3}};
        for (int i = 0; i < e.length; i++) {
            int sumrows = 0;
            for (int j = 0; j < e.length; j++) {

                sumrows = sumrows + e[i][j];// for cols a[j][i]

            }
            System.out.println("sum of row ----" + (i + 1) + "   " +sumrows);
        }
        System.out.println();
        for (int i = 0; i < e.length; i++) {
            int sumcol = 0;
            for (int j = 0; j < e.length; j++) {

                sumcol= sumcol+ e[j][i];// for cols a[j][i]

            }
            System.out.println("sum of row |||" + (i + 1) + "   " +sumcol);
        }

    }

    public static void tranpose(int[][] a) {
        System.out.println("Tranpose of matrix");
        int[][] t = new int[a.length][a.length];
        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a.length; j++) {
                t[i][j] = a[j][i];

            }
            System.out.println();
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(" " + t[i][j]);

            }
            System.out.println();


        }
    }
    public static void identity(int[][] a) {
        System.out.println("CHECK IDENTITY of matrix");
int flag=0;
int[][] am={{1,0,0},{0,1,0},{0,0,1}};
        for (int i = 0; i < am.length; i++) {
            for (int j = 0; j < am.length; j++) {
                if (i == j && am[i][j] != 1) {
                    flag = 1;
                }
                if (i != j && am[i][j] != 0) {
                    flag = 1;
                }

            }
        }
            if(flag==0){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }

            }

        }




