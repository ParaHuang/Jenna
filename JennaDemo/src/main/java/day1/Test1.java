package day1;

public class Test1 {
    public static void main(String[] args) {
        //what is exception:
        // runtime exception(usually you can avoid with logic)
        // compile exception
        //how to deal with it
        //  1.try...catch...finally...
        //  2.throws

        //create exception  -> throw
        int a = 10;
        int b = 3;
        try {

            int c = a / b;
            System.out.println(c);
        }catch (Exception e){
            //e.printStackTrace();//print the exception information
            System.out.println("can't be divided by 0");
        }

        System.out.println("the end of the program");

        /*
        try{
            the codes might have exception
        }catch(Exception e){
            solution when exception happens
        }
        //xxxxxx
        */
        //there is an exception
//        Class.forName("");

    }
}
