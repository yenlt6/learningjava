package learning.kiemtra02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BaiTap2 {
    public static void chayChuongTring() {
        ArrayList<String> array = new ArrayList<>();
        array.addAll(nhapTuBanPhim());
        sortStringList(array);
//        array.stream().forEach(System::prin);

    }


    public static ArrayList<String> nhapTuBanPhim(){
        //nhap 20 tu vao tu ban phim va sap xep theo thu tu chu cai tang dang
        ArrayList<String> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (arrayList.size() < 10) {
            System.out.println("nhap tu vao:");
            arrayList.add(scanner.nextLine());
        }
        int leng = arrayList.size();
        System.out.println("mang da nhap có tong so phan tu = " + leng);
        return arrayList;
    }

    /*
    nhập 20 phần tử từ bàn phím và sắp xếp theo thứ tự chữ cái tăng dần
     */
    public static void cach1(){
        System.out.println("Yen");
        //nhap 20 tu vao tu ban phim va sap xep theo thu tu chu cai tang dang
        ArrayList<String> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (arrayList.size() < 21) {
            System.out.println("nhap tu vao:");
            arrayList.add(scanner.nextLine());
        }
        //in cac phan thu trong list ra man hinh:
        System.out.println("20 tu da nhap");

        Collections.sort(arrayList);
        for (
                String str : arrayList) {
            System.out.println(str);
        }
    }


    public boolean isGreaterThan(String a, String b) {
        return true;
    }


    public static void sortStringList(ArrayList<String> array) {
        String temp = null;
        for (int i = 0; i < array.size(); i++) {
            for (int j = i + 1; j < array.size(); j++) {
                if (array.get(i).compareTo(array.get(j)) > 0) {
                    temp = array.get(i);
                    array.set(i, array.get(j));
                    array.set(j, temp);
                }
            }


        }

        System.out.println("các phan tu cua mang sau khi sap xep");
        for(String a : array){
            System.out.println(a);
        }
    }

}
