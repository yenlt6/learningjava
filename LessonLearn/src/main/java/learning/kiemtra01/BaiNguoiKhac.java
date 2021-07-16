package learning.kiemtra01;

import java.util.Arrays;
        import java.util.TreeSet;
        import java.util.*;
        import java.io.*;
        import static java.util.stream.Collectors.toCollection;


class BaiNguoiKhac {

    public static String FindIntersection(String[] strArr) {
        TreeSet<Integer> set1 = Arrays.stream(strArr[0].replace(" ", "").split(",")).map(Integer::parseInt).collect(toCollection(TreeSet::new));
        var a= Arrays.stream(strArr[0].replace(" ", "").split(","));
        var b =a.map(Integer::parseInt).collect(toCollection(TreeSet::new));
        System.out.println("yyyyy" + set1);
        TreeSet<Integer> set2 = Arrays.stream(strArr[1].replace(" ", "").split(",")).map(Integer::parseInt).collect(toCollection(TreeSet::new));
        set1.retainAll(set2);

        return (set1.isEmpty() ? "false" : Arrays.toString(new TreeSet<>(set1).toArray()).replace("]", "").replace("[", "").replace(" ", ""));
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
//        System.out.print(FindIntersection(s.nextLine()));

//        System.out.print(FindIntersection(new String[] {"1, 2, 3, 4, 5", "6, 7, 8, 9, 10"}));
//        System.out.print(FindIntersection(new String[]{"21, 22, 23, 25, 27, 28", "21, 24, 25, 29"}));
        System.out.print(FindIntersection(new String[]{"1,3,25, 21, 21, 22, 23, 25, 24, 28", "21, 24, 24, 25, 29"}));


    }

}