import java.util.*;
public class Ascii{
    public static void main(String[] args) {
        char c='a';
        int b=c;
        System.out.println(b);
        int ascii1 = (int) c;
        System.out.println(ascii1);

        Scanner sc = new Scanner(System.in);
        char chr = sc.next().charAt(0);
    }
}
