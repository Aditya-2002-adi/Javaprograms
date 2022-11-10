public class Stringbuffer {
    public static void main(String[] args) {


        StringBuffermethod();
        StringBuildermethod();
    }
    public static void StringBuffermethod() {
        System.out.println("String buffer is mutable we can change data frequently based on our work: ");
        System.out.println("String class in imutable evry time we create a straig it creates a new object :");
        System.out.println("--------------------------" + "\n" + "Let us do some opertaions on String buffer " +
                        "all methods are synchrozed and performance are down");


        StringBuffer s = new StringBuffer("Mehnaaz Tabasum");

        System.out.println(s.capacity());   //16 by default + length of data
        System.out.println(s.append("hii"));
        System.out.println(s.charAt(2));
        System.out.println(s.delete(0, 1));
        System.out.println(s.deleteCharAt(2));
        System.out.println(s.indexOf("a"));
        System.out.println(s.lastIndexOf("z"));
        System.out.println(s.insert(2, "aa"));
        System.out.println(s.replace(3, 6, "mm"));
        System.out.println(s.reverse());
        //System.out.println(s.setCharAt(0,'m');


    }
    public static void StringBuildermethod() {
        System.out.println("Non synchronized methods are performed in string builder: ");
        //same methods but non sychronized

    }
}
