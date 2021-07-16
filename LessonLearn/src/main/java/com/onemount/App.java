package com.onemount;

//import learning.scaninput03.GuessNumber;
//import learning.scaninput03.Logic;

import learning.collection12.DemoList;
import learning.collection12.DemoMap;
import learning.loop1705.LearnLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        String[] strArr =new String[] {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"};

        System.out.println("In ket qua: " + FindIntersection1(new String[] {"2, 5, 7, 10, 11, 12", "2, 7, 8, 9, 10, 11, 15"}));
        }


    public static String FindIntersection(String[] strArr) {
        System.out.println("Lam bai tot nhe");
        // code goes here
//        String[] str = {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"};
        String str1 = strArr[0];
        String str2 = strArr[1];
        String strArray1[] =str1.split(", ");
        for(String a:strArray1) {
            System.out.println("====== " + a);
        }

        System.out.println("Bien phan tu thu 2 thanh mot mang");
        String strArray2[] =str2.split(", ");
        for(String b:strArray2) {
            System.out.println("====== " + b);
        }
        System.out.println("so luong phan tu: " + strArray1.length);
        if(strArray1.length!=strArray1.length){
            System.out.println("Khoong cung so luong phan tu");
        }else {
            System.out.println("Cung so luong phan tu");
        }

        // Timf ra cac pha tu giong nhau o ca 2 mang
        int leng = strArray1.length;

        String strArray3[] = new String[leng];
        int count=0;


        for(int i=0;i<leng;i++){
            for(int j=0;j<leng;j++){
                if(strArray1[i].equals(strArray2[j])){
                    System.out.println("111111::::" + strArray1[i]);
                    System.out.println("22222::::" + strArray2[j]);
                    strArray3[count]=strArray1[i];
                    System.out.println("33333::::" + strArray3[count]);
                    count++;
                }
            }
        }

        System.out.println("Timf ra mot mang chua cac phan tu la giao cua 2 mang");
        for(String c : strArray3){
            System.out.println("cccccc = " + c);
        }
        String output=strArray3[0];
        for(int i=1; i<count;i++){
            output=output+ "," + strArray3[i];
        }
        return output;
    }

    public static String FindIntersection1(String[] strArr) {
        System.out.println("Lam bai tot nhe");
        String str1 = strArr[0];
        String str2 = strArr[1];
        String strArray1[] =str1.split(", ");
        String strArray2[] =str2.split(", ");
        // Timf ra cac pha tu giong nhau o ca 2 mang
        String strArray3[] = new String[strArray1.length];
        int count=0;
        for(int i=0;i<strArray1.length;i++){
            for(int j=0;j<strArray2.length;j++){
                if(strArray1[i].equals(strArray2[j])){
                    strArray3[count]=strArray1[i];
                    count++;
                }
            }
        }
        String output=strArray3[0];
        for(int i=1; i<count;i++){
            output=output+ "," + strArray3[i].strip();
        }
        return output;
    }

}
