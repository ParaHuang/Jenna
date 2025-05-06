package day3;

public class Test1 {
    public static void main(String[] args) {
//        printN(10);
        int result = factorial(5);
        System.out.println(result);

        System.out.println(fib(10));
    }
    //the key of recursion:find the common situation, and stop situation
    //print n,n-1,n-2,....,3,2,1
    //recursion: inside of a method, cal this method itself
    //essential for recursion:stop condition
    public static void printN(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
//        int x = n-1;
        printN(n-1);//->{System.out.println(n-1);}

    }

    //f(5) = 5*4*3*2*1 = 5*f(4)
    //f(4) = 4*3*2*1 = 4*f(3)
    //f(3) = 3*2*1 = 3*f(2)
    //f(2) = 2*1  = 2*f(1)
    //f(1) = 1 = 1

    //f(n) = n*f(n-1)
    public static int factorial(int n){
        if(n == 1){
            return 1;
        }
//        System.out.println(n);
        return n*factorial(n-1);
//           ->  4*f(3)
//              -> 3*f(2)
//                  ->2*f(1)
//                      ->1
    }

    //position:0  1  2  3  4  5  6  7   8  9  10 11  12
    //fib:     0  1  1  2  3  5  8  13  21 34 55 89  134
    //f(7) = 13 = f(6)          +                           f(5)
    //       f(5)  +   f(4)                             f(4)+f(3)
    //      f(4)+f(3)        f(3)+f(2)                  f(3)+f(2)    f(2)+f(1)
    // f(3)+f(2)  f(2)+    f(1)  f(2)+f(1)  f(1)+f(0)
    //           f(1)+f(0)  1                1     0
    //             1   0
    public static int fib(int n){
        if(n<2){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
}
