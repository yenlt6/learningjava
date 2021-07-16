package learning.kiemtra01;

import java.util.*;
import java.io.*;

public class YenNopBai {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print(FindIntersection(s.nextLine()));
//        System.out.print(FindIntersection(new String[] {"1, 2, 3, 4, 5", "6, 7, 8, 9, 10"}));
//        System.out.print(FindIntersection(new String[]{"21, 22, 23, 25, 27, 28", "21, 24, 25, 29"}));
        System.out.print(FindIntersection(new String[]{"1, 3, 25, 21, 21, 22, 23, 25, 24, 28", "21, 24, 24, 25, 29"}));

    }


    public static String FindIntersection(String[] strArr) {
        String str1 = strArr[0];
        String str2 = strArr[1];

        String strArray1[] = str1.replace(" ", "").split(",");
        String strArray2[] = str2.replace(" ", "").split(",");
        // Timf ra cac pha tu giong nhau o ca 2 mang
        String strArray3[] = new String[strArray1.length];
        int count = 0;
        for (int i = 0; i < strArray1.length; i++) {
            for (int j = 0; j < strArray2.length; j++) {
                if (strArray1[i].equals(strArray2[j])) {
                    strArray3[count] = strArray1[i];
                    count++;
                }
            }
        }

        String output = "";
        for (int i = 0; i < count; i++) {
            output = output + "," + strArray3[i].strip();
            if (i == 0) {
                output = output.substring(1);
            }
        }
        return output == "" ? String.valueOf(false) : output;
    }


}