

import java.io.File;
import java.io.*;
import java.util.Scanner;

public class Filehandling {

    public static void main(String[] args) {
        filecreation ();
        fileexist();
        filereading();
        filewriting();
        System.out.println("We can access random files also byusing random access files");
    }
        public static void filecreation() {
            try {
                File f = new File("Name.txt");
                if (f.createNewFile()) {
                    System.out.println("File is been created" + f.getName());
                } else {
                    System.out.println("file already exist");
                }

            } catch (IOException e) {
                System.out.println("error");
                e.printStackTrace();
            }
        }
        public static void fileexist(){

            File f = new File("Name.txt");
            if(f.exists()){
                System.out.println(f.getName());//name of file
                System.out.println(f.getAbsoluteFile());//file path
                System.out.println(f.canRead());//boolen values
                System.out.println(f.canWrite());
                System.out.println("length of"+f.length());
            }
            else {
                System.out.println("file not there..");
            }

        }
    public static void filereading() {
        try {
            System.out.println("Getting content form the file..");
            File fR = new File("Name.txt"); // creating file object
            Scanner sc=new Scanner(fR); //acccesing that fr values form scanner
            while(sc.hasNextLine()){ //reading line by line
                String val=sc.nextLine();
                System.out.println(val);
            }
            sc.close();


        } catch (FileNotFoundException e) {
            System.out.println("error");
            e.printStackTrace();
        }
    }
    public static void filewriting() {
        try {
            FileWriter fw = new FileWriter("Name.txt");
            fw.write("Im mehnaaz tabasum im 3rd year student in VIT-AP...");
           fw.close();
            System.out.println("file  written successfully..");

        } catch (IOException e) {
            System.out.println("error");
            e.printStackTrace();
        }
    }

        }


