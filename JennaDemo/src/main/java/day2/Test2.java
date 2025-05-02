package day2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Test2 {
    public static void main(String[] args) {
        /*
        input:  file        ->      program         (read)
        output: program     ->      file            (write)
         */
        try (FileOutputStream out = new FileOutputStream("/Users/parahuang/Downloads/abc.txt",true);){
            out.write("\r\nnew content".getBytes());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
