

public class Patterns {
    public static void main(String[] args) {
        int n = 6;
        pattern1(n);
        pattern2(n);
        pattern3(n);
        pattern4(n);
        pattern5(n);
        pattern6(n);
        pattern7(n);
        pattern8number(n);
        pattern9number(n);
        pattern10number(n);
        pattern11number(n);
        pattern12number(n);

    }


    public static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("X  ");
            }
            System.out.println();
        }

    }


    public static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("=  ");
            }
            System.out.println();
        }
    }


    public static void pattern3(int n) {

        System.out.println("reverse");
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("=  ");
            }
            System.out.println();
        }
    }

    public static void pattern4(int n) {

        System.out.println("reverse");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("X");
            }
            System.out.println();
        }
    }

    public static void pattern5(int n) {

        System.out.println("Daimond ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("X ");
            }
            System.out.println();
        }
    }

    public static void pattern6(int n) {

        System.out.println("Full daimond");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = n; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void pattern7(int n) {
        System.out.println("Full daimond");

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void pattern8number(int n) {
        System.out.println("number");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

    }

    public static void pattern9number(int n) {
        System.out.println("Number 2");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

    public static void pattern10number(int n) {
        System.out.println("number 3");

        for (int i = n; i >= 0; i--) {
            for (int j = n; j >= i; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }

    public static void pattern11number(int n) {
        System.out.println("number 4");

        for (int i = 1; i<=n; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }

    }

    public static void pattern12number(int n) {
        System.out.println();
        System.out.println("number 5");

        for (int i = 10; i>=0; i--) {
            for (int j = 1; j <i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }

    }
}
