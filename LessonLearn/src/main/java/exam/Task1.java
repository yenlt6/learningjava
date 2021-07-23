package exam;

import learning.learnexception1516.AgeCheckingException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Pattern;

import static java.util.stream.Collectors.toCollection;

/**
 * Write a program that will read a string containing numbers from the keyboard, each number is separated by comma ","
 * Display to screen the whole list of number in decreasing sorting order.
 * If string contains alphabetical character instead of a number, then the method should catch an exception and display to screen the message "String contains character which cannot be converted into number".
 * Requirements:
 * •The program must read a string of numbers from the keyboard.
 * •The readData method is to read numbers from the keyboard
 * •The readData method must contain a try-catch block.
 * •The sortNumber method is to sorting list of numbers into decreasing order.
 * •The readData method calls sortNumber method.
 * •If the user enters alphabetical character rather than a number, the program should display message "String contains character which cannot be converted into number".
 */

public class Task1 {
    public static void sortNumberList(String str) throws CheckingInputException {

        ArrayList<Integer> arrayList = Arrays.stream(str.replace(" ", "").replace("[", "").replace("]", "").split(",")).map(Integer::parseInt).collect(toCollection(ArrayList::new));
        Collections.sort(arrayList, Collections.reverseOrder());
        System.out.println("Danh sách số nhập vào theo thư tự giảm dần:");
        System.out.println(arrayList);
        arrayList.forEach(System.out::println);

    }

    public static void main(String[] args) throws CheckingInputException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào từ bàn phím một chuỗi chứa các số, các số được ngăn cách bởi dấu , ");
        String str = scanner.nextLine();

        String[] temp = str.replace(" ", "").split(",");
        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
            if (temp[i].contains("[a-zA-Z]+") == true) {
                System.out.println("Chứa ký tự");
                throw new CheckingInputException("String contains character which cannot be converted into number");
            }

        }

        sortNumberList(str);

    }
}
