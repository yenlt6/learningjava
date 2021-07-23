package learning.baitapcodebyte;

import java.util.*;
import java.io.*;

public class Main {

    public static long FirstFactorial(int num) {
        // code goes here
//        long n = (long) num;

        long result = 1;
        for (int i = 1; i <= num; i++) {
            result = result * i;
        }
        return result;
    }


//    public static int FirstFactorial(int num) {
//        // code goes here
//
//
//        int result = 1;
//        for (int i = 2; i <= num; i++) {
//            result = result * i;
//        }
//        return result;
//    }


    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        int i=0;
        System.out.println("Nhập số cần tính giai thừa: ");
        i = s.nextInt();
        System.out.print(FirstFactorial(i));

    }

}