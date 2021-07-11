package com.onemount;

//import learning.scaninput03.GuessNumber;
//import learning.scaninput03.Logic;

import learning.loop1705.LearnLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Lam bai tot nhe");

        // Creating a list of Strings
        List<String> list = Arrays.asList("3", "4", "8",
                "14", "15");
//        System.out.println("=====" + list);

  list.stream().mapToInt(num -> Integer.parseInt(num)).forEach(System.out::println);




////        String[] strArr = new String[] {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"};
//        String[] strArr = new String[] {"Yen", "Yen2"};
//        System.out.println("Phan tu th nhat cua chuoi" + strArr[0]);
//        //bien phan tu thu nhat thanh mot mang cac so nguyen
////        List<String> intArr = Arrays.stream(strArr).toList();
////        List<String> intArr = Arrays.stream(strArr).mapToInt();
//        String out ="1,4,13";
//
////        System.out.println("===" + intArr);


//        int[] strArr = new int["[1, 2, 5, 6]", "[5, 2, 8, 11]"],
//        String[] strArr = new String["Yen", "Yen1"];
//        String[] strArr= new String[]{"Yen", "Yen1"};
//        ArrayList<Integer> strArr = new ArrayList<>(List.of([1, 2, 5, 6]));
//        strArr.add

        }
//public static void ArrayMatching (int[] strArr ){
//
//}


}
