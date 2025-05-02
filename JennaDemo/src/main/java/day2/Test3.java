package day2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Test3 {
    public static void main(String[] args) throws Exception {
        //copy file
        //      /Users/parahuang/Downloads/hello.txt
        //      /Users/parahuang/Desktop/test/hello.txt
        FileInputStream in = new FileInputStream("/Users/parahuang/Downloads/hello.txt");
        byte[] b_arr = in.readAllBytes();
        FileOutputStream out = new FileOutputStream("/Users/parahuang/Desktop/test/hello.txt");
        out.write(b_arr);

        out.close();
        in.close();
    }
}
