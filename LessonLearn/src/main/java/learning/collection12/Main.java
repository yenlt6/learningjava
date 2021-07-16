package learning.collection12;

import java.util.*;
import java.io.*;

class Main {



    public static void main (String[] args) {
        DemoList.demoArray();

    }

    public static String FindIntersection(String[] strArr) {

//        // keep this function call here
//        String[] strArr =new String[] {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"};
//        Scanner s = new Scanner(System.in);
////        System.out.print(FindIntersection(s.nextLine()));
//        System.out.print(FindIntersection1(strArr));



        // code goes here
        String str1[]=strArr[0].split(", ");
        String str2[]=strArr[1].split(", ");
        int i = 0;
        int j = 0;
        StringBuilder ans = new StringBuilder();
        while( i < str1.length && j < str2.length){
            if(Integer.parseInt(str1[i])== Integer.parseInt(str2[j])){
                ans.append(str1[i]+",");
                i++;
                j++;
            }else if(Integer.parseInt(str1[i]) > Integer.parseInt(str2[j])){
                j++;
            }else{
                i++;
            }
        }
        if(ans.toString().length() == 0)
            strArr[0] ="false";
        else{
            String anser = ans.toString().substring(0,ans.toString().length()-1);
            strArr[0]=anser;
        }
        return strArr[0];
    }






    public static String FindIntersection1(String[] strArr) {
        // code goes here
        String[] arr1 = strArr[0].split(", ");
        String[] arr2 = strArr[1].split(", ");
        String result = "";
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr1[i].equals(arr2[j])){
                    result = result+","+arr1[i].trim();
                    break;
                }
            }
        }

        if(result==""){
            strArr[0] = "false";
        } else{
            strArr[0] = result = result.substring(1, result.length());
        }
        return strArr[0];
    }



}