package com.onemount;

import java.util.Scanner;
//        https://codelearn.io/learning/java-fundamentals/1198357
public class LearnString {
    public static void getPosition(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap String s: ");
        String s = sc.nextLine();
        System.out.println("Nhap Char c: ");
        char c = sc.next().charAt(0);
        int answer = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                /*
                 * Use break statement to terminate the loop because
                 * we had found the first occurence of c.
                 * If we don't use break statement, the program will produce
                 * the last position of c's occurence.
                 */
                answer = i;
                break;
            }
        }
        System.out.print(answer);
        System.out.printf("Vi tri cua %c trong chuoi %s nam o %d",c,s,answer);

    }


}
