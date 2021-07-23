package exam;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
       String str = readString();
        System.out.println("\nViết in hoa chữ cái đầu tiên của tất cả các từ:  ");
        System.out.println(upperCaseString(str));

    }


    public static String upperCaseString(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] strArr = input.trim().split("\\s+");
        for (String str : strArr) {
            String firstChar = String.valueOf(str.charAt(0));
            stringBuilder.append(firstChar.toUpperCase() + str.substring(1));
            stringBuilder.append(" ");
        }
        return stringBuilder.toString().trim();
    }


    public static String readString()  {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhập một chuỗ từ bàn phím: ");
        String str = scanner.nextLine();

        return str;
    }





}
