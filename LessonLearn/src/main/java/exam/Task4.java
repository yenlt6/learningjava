package exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 1. Use the keyboard to enter the number N.
 * <p>
 * 2. Use the keyboard to enter N integers and put them in a list: the getIntegerList method.
 * <p>
 * 3. Find the minimum among the list items: the getMinimum method.
 * <p>
 * Requirements:
 * •The program should read values from the keyboard.
 * •The getIntegerList() method should read the number N from the keyboard and then return a list of N elements, which has been filled with numbers read from the keyboard.
 * •The getMinimum() method must return the minimum among the list items.
 * •The main() method should call the getIntegerList() method.
 * •The main() method should call the getMinimum() method.
 */
public class Task4 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList = getIntegerList();
        getMinimum(arrayList);
    }

    public static int getMinimum(List<Integer> array) {

        int min = array.get(0);

        for(int i=1;i<array.size();i++){
            if(array.get(i)<min){
                min=array.get(i);
            }
        }
        System.out.println("Giá trị nhỏ nhất của mảng: " + min);

        return min;
    }


    public static List<Integer> getIntegerList() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhập số phần tử của mảng N :");
        int n = scanner.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("nhap vào giá trị thứ " + i + " của mảng:");
            arrayList.add(scanner.nextInt());
        }




        return arrayList;
    }
}