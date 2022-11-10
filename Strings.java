import java.lang.*;
import java.util.*;

public class Strings {
    public static void main(String[] args) {
        String s = "Mehnaaz";

        length(s);
        System.out.println("--------------------------------");

        Vowels(s);
        System.out.println("--------------------------------");

        Anagram(s);
        System.out.println("--------------------------------");

        Replacechars();
        System.out.println("--------------------------------");

        Methods();
        System.out.println("--------------------------------");

        Reversestr();

        Maimumstring();
        MiniumString();
        Duplicatecahr();
    }

    public static void length(String s) {
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                c++;
            }

        }
        System.out.println(c);
    }

    public static void Vowels(String s) {
        int c = 0, c1 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'e' || s.charAt(i) == 'a' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                c++;

            } else {
                c1++;
            }

        }

        System.out.println("Vowels : " + c + "\n" + "Constants : " + c1);
    }

    public static void Anagram(String s) {
        System.out.println("\n Anagram means same characters in string with differnt sequnce of characters");
        String S1 = "grab";
        String S2 = "bRAG";
        S1 = S1.toLowerCase();
        S2 = S2.toLowerCase();

        char[] S11 = S1.toCharArray();
        char[] S22 = S2.toCharArray();

        System.out.println(S1 + " " + S2);

        if (S1.length() != S2.length()) {
            System.out.println("Lnegth unequal no anagaram");
        } else {
            Arrays.sort(S11);
            Arrays.sort(S22);
        }


        if (Arrays.equals(S11, S22)) {
            System.out.println("Yes anagram");
        }

        //Removes the white spaces using regex
        // str1 = str1.replaceAll("\\s+", "");
    }

    public static void Replacechars() {
        String str1 = "Great Power";

        StringBuffer newStr = new StringBuffer(str1);

        for (int i = 0; i < str1.length(); i++) {

            //Checks for lower case character
            if (Character.isLowerCase(str1.charAt(i))) {
                //Convert it into upper case using toUpperCase() function

                newStr.setCharAt(i, Character.toUpperCase(str1.charAt(i)));
            }
            //Checks for upper case character
            else if (Character.isUpperCase(str1.charAt(i))) {
                //Convert it into upper case using toLowerCase() function
                newStr.setCharAt(i, Character.toLowerCase(str1.charAt(i)));
            }
        }
        System.out.println("String after case conversion : " + newStr);
    }

    public static void Methods() {
        String s = " TTabasum";
        System.out.println(s.length());
        int n = s.length();
        System.out.println(n);

        System.out.println(s.isEmpty());
        System.out.println(s.trim()); //remove st and end white spaces
//Comparing strings
        String s1 = "Tabasum";
        String s2 = "tabasum";
        System.out.println("takes case sentive false : " + s1.equals(s2));  // takes case sentive false

        System.out.println("\n" + "Treats both uppper and lower as same: " + s1.equalsIgnoreCase(s2));

//by using string is empty or ot by putting " "
        System.out.println("Compare to method uses Lexiographically values:  and in integers -");
        String A = "A";
        String a = "a";
        System.out.println(A.compareTo(a));
        System.out.println(A.compareToIgnoreCase(a));// igncoces cases


//BODMAS RULE IN STRINGS
        System.out.println(String.join(",,", A, a));

//Subsequnce of string (3 to 9) means gives 3 to 8 values

        String m = "SHAIK MEHNAAZ TABASUM";
        System.out.println(m.subSequence(0, 4));

        // returns in character sequcne

        //substring same but returns n string

        //Replace functions
        System.out.println("Replace functions: ");

        System.out.println(m.replace("ee", "aa"));
        System.out.println(m.replaceFirst("ee", "aa"));//only 1st value
        System.out.println(m.replaceAll("aa(.*)", "aa"));// we can put regex like expression also

        System.out.println("Converting strings :" + m.toLowerCase());
        System.out.println(m.toUpperCase());

        System.out.println("converting into character array..");
        char[] c = m.toCharArray();
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);

        }
        int aa = 100;
        String saa = String.valueOf(aa);  //we can add and pass float andall

        System.out.println(saa);


    }

    public static void Reversestr() {
        System.out.println("..............................");
        String s = "MEHNAAZ Tabasum";
        System.out.println("Reverse a String:  " + s);
        String sr = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            sr += s.charAt(i);
        }
        System.out.println(sr);
        System.out.println("By this we can check palindrome of string also: ");

        if (s.equals(sr)) {
            System.out.println("Equals palindrome..");
        } else {
            System.out.println("Not a palindrome..");
        }
    }

    public static void Maimumstring() {
        System.out.println("To find maximum occurences of letter in string;");
        String m = "MMEEHHHNNNNNNNAAZ";
        int a[] = new int[128];
        for (int i = 0; i < m.length() ; i++) {
            a[m.charAt(i)] = a[m.charAt(i)] + 1;  //a[m.charAt(i)]position value like ascii values

        }
        int max=-1;
       char c=' ';
        for (int i = 0; i < m.length(); i++) {
           if(max<a[m.charAt(i)]){
               max=a[m.charAt(i)];// putting maximum count in max varalible
               c=m.charAt(i);//getting character name
           }


        }
        System.out.println("values is: "+c);

    }

    public static void MiniumString() {
        String m1="abbbssccc";
        int []a=new int[128];
        for(int i=0;i<m1.length();i++){
            a[m1.charAt(i)]=a[m1.charAt(i)]+1;
        }
        int min=0;
      char c1=' ';
      for(int i=0;i<m1.length();i++){
          if(min>a[m1.charAt(i)]){
              min=a[m1.charAt(i)];
              c1=m1.charAt(i);
          }
      }
        System.out.println("Minimum value : "  + c1);


    }

    public static void Duplicatecahr() {
        String Name="Mehhnaaazz";
        System.out.println("Finding Duplicate characters: ");
        char[] c=Name.toCharArray();

        for(int i=0;i<c.length;i++){
            int count=1;
            for(int j=i+1;j<c.length;j++)
            {
                if(c[i]==c[j]&&c[i]!=' '){
                    count++;
                    c[j]='0'; // to avoid visted charatcer again
                }
            }
            if(count>1 && c[i]!='0'){
                System.out.println(c[i]);
            }
        }


    }
}





