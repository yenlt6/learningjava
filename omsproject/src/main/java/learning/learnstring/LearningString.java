package learning.learnstring;

import java.util.Scanner;

public class LearningString {
    public static void method1(){
        String a="Yen";
        String b="Yen";
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhap Gia Tri b: ");
//        b=scanner.next();
        if(a.toString()==b.toString()){
            System.out.println("Toi la Yen");
        }else{
            System.out.println("Toi ko phai la Yen");
        }

    }
}
