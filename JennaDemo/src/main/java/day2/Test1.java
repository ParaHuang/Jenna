package day2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Test1 {
    public static void main(String[] args) {
        //read by bytes -> all files
        //read by character -> text files (txt)
//        FileInputStream in = new FileInputStream(thePathOfYourFile);
        //create a FileInputStream object based on a paht
        try(FileInputStream in = new FileInputStream("/Users/parahuang/Downloads/hello.txt");) {
            /*
            //a Chinese character = 2 bytes
            int x = in.read();      //ASCII code
            System.out.println((char)x);
            int y = in.read();
            System.out.println((char)y);
             */
            /*
            byte[] b = new byte[10];//temporary container
            //returns a int, represent the real length of the content you just read.if there is nothing left, returns -1
            int len1 = in.read(b);
            //b -> String content
            String x = new String(b);
            System.out.print(x);

            int len2 = in.read(b);
            String y = new String(b);
            System.out.print(y);

            int len3 = in.read(b);
            String z = new String(b);
            System.out.print(z);

            int len4 = in.read(b);
            int len5 = in.read(b);
            int len6 = in.read(b);
            int len7 = in.read(b);
            System.out.println(len1);
            System.out.println(len2);
            System.out.println(len3);
            System.out.println(len4);
            System.out.println(len5);
            System.out.println(len6);
            System.out.println(len7);
            */
/*
            byte[] b = new byte[100];      //1K
            String content = "";
            while(true){
                int len = in.read(b);
                System.out.println(len);
                if(len == -1){
                    break;
                }
                //convert byte[] into String, from 0 to len
                content += new String(b,0,len);
            }
            System.out.println(content);
            */
            byte[] bs = in.readAllBytes();
            String x = new String(bs);
            System.out.println(x);
//            for (byte b :bs) {
//                System.out.println(b);
//            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
