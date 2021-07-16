package learning.kiemtra01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

import static java.util.stream.Collectors.toCollection;


class BaiNguoiKhac1 {

    public static String FindIntersection(String[] strArr) {
        // code goes here
        String answer = "";
        ArrayList<String> s1 = new ArrayList<String>();
        ArrayList<String> s2 = new ArrayList<String>();
//        TreeSet<String> s1 = new TreeSet<>();
//        TreeSet<String> s2 = new TreeSet<>();



        s1 = getList(strArr[0]);
        s2 = getList(strArr[1]);
        for (String x: s1){
            for (String y: s2){
                if (x.equals(y)){
                    answer += x + ",";
                }
            }
        }
        if (answer.equals("")){
            return "false";
        } else {
            return answer.substring(0, answer.length() -1);
        }
    }

    public static ArrayList<String> getList(String y){
        ArrayList<String> s = new ArrayList<String>();
        while (y.indexOf(",") != -1){
            s.add(y.substring(0, y.indexOf(",")));
            y = y.substring(y.indexOf(",") + 2);
        }
        s.add(y);
        return s;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
//        System.out.print(FindIntersection(s.nextLine()));

//        System.out.print(FindIntersection(new String[] {"1, 2, 3, 4, 5", "6, 7, 8, 9, 10"}));
//        System.out.print(FindIntersection(new String[]{"21, 22, 23, 25, 27, 28", "21, 24, 25, 29"}));
        System.out.print(FindIntersection(new String[]{"1, 3, 25, 21, 21, 22, 23, 25, 24, 28", "21, 24, 24, 25, 29"}));


    }

}