package learning.kiemtra02;

import java.util.*;

public class Main {
public static void main(String[] arrStr){
//    Character.isUpperCase()
    //NHập một chuỗi từ bàn phím và tách ra các ký tự là nguyên âm và phụ âm
    String  str = null;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhập một chuỗi từ bàn phím");
    str = scanner.nextLine();
    ArrayList<Character> arrayList = new ArrayList<Character>(List.of('a','A','u','U','o','O','i','I','e','E'));
    StringBuffer stringVowels  = new StringBuffer();
    StringBuffer stringConsonants  = new StringBuffer();
    System.out.println("Leng = " + str.length());
    for(int i=0; i<str.length();i++){
        str.charAt(i);
        if(arrayList.contains(str.charAt(i))) {
            System.out.println("Them cac ky tu la nguyen vao mot mang");
            stringVowels.append(str.charAt(i));
        }else
            if(str.charAt(i)!=' '){
            stringConsonants.append(str.charAt(i));
        }

    }
    String a = "";
    System.out.println("Chuỗi chứa các ký tự nguyên âm");
    for(int i=0;i<stringVowels.length();i++){
        a=a + " " + stringVowels.charAt(i);

    }
    System.out.println(a.trim());
    System.out.println("Chuỗi chứa các ký tự phu am");
    System.out.println(stringConsonants);


//    arrayList.contains()


}


}
