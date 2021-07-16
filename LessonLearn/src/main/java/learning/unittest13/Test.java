package learning.unittest13;

import javax.xml.transform.Result;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        int a = 4, b = 9;

        double c = test.div(a, b);
        System.out.println(c);
    }

    public double div(int a, int b){

        return (double) b/a;
    }

//    String contact(){
//        Scanner sc = new Scanner(System.in);
//        String phoneNumber = sc.nextLine();
//        return phoneNumber;
//    }
}
