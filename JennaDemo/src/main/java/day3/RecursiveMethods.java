package day3;

public class RecursiveMethods {

    //717->rightmost:7 ->+1, 71->rightmost:1 ->+0,7->rightmost:7 ->+1 , 0 ->stop
    //1.get the rightmost number: 7-> +1    not 7-> nothing adds up
    //2.remove the rightmost number, start from step 1

    public static int count7(int n) {
        // Given a non-negative int n,
        // return the count of the occurrences of 7 as a digit,
        // so for example 717 yields 2. (no loops).
        // Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6),
        // while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
        if(n == 0){
            return 0;
        }
        int rightmost = n%10;
        if(rightmost == 7){
//            +1->next
            return 1 + count7(n/10);
        }else{
            return 0 + count7(n/10);
        }
    }
}
