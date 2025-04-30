package day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test2 {
    public static void main(String[] args) {
//        devideBy0();
        fun1();

        try {
            fun2();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static void devideBy0() throws ArithmeticException{
        int a = 10;
        int b = 0;
        int c = a/b;
        System.out.println(c);

        System.out.println("the end of method");
    }

    public static void fun1(){

        try {
            FileReader reader = new FileReader("/Users/parahuang/Downloads/Java_Tutoring.pdf");
            System.out.println("correct code");
        } catch (FileNotFoundException e) {
            System.out.println("this path is wrong");
        }finally {
            System.out.println("the part will be executed no matter exception happens or not");
        }
        System.out.println("the end of method");
    }
    public static void fun2() throws FileNotFoundException {
        FileReader reader = new FileReader("/Users/parahuang/Downloads/Java_Tutoring.pdf");
    }

}
