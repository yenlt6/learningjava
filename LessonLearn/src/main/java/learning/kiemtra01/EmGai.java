package learning.kiemtra01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.util.stream.Collectors.toCollection;

public class EmGai {
    public static String add2array(String[] strArr){
        ArrayList<Integer> arrayList1 = Arrays.stream(strArr[0].replace(" ", "").replace("[","").replace("]","").split(",")).map(Integer::parseInt).collect(toCollection(ArrayList::new));
        System.out.println(arrayList1);
        ArrayList<Integer> arrayList2 = Arrays.stream(strArr[1].replace(" ", "").replace("[","").replace("]","").split(",")).map(Integer::parseInt).collect(toCollection(ArrayList::new));
        System.out.println(arrayList2);
        int leng1 = arrayList1.size();
        int leng2 = arrayList2.size();
        StringBuffer stringBuffer = new StringBuffer();
        if (leng1<=leng2) {
            for (int i = 0; i < leng1; i++) {
                stringBuffer.append(arrayList1.get(i) + arrayList2.get(i));
                stringBuffer.append("-");
            }
            for(int j=leng1;j<leng2;j++){
                stringBuffer.append(arrayList2.get(j));
                stringBuffer.append("-");
            }

        }else{
            for (int i = 0; i < leng2; i++) {
                stringBuffer.append(arrayList1.get(i) + arrayList2.get(i));
                stringBuffer.append("-");
            }
            for(int j=leng2;j<leng1;j++){
                stringBuffer.append(arrayList1.get(j));
                stringBuffer.append("-");
            }
        }
        String result = null;
        result = stringBuffer.substring(0, stringBuffer.length() - 1);
        return result;
    }
    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
//        System.out.print(add2array(s.nextLine()));
        String arrStr[] = new String [] {"[5, 2, 3]", "[2, 2, 3, 10, 6]"};
//        String arrStr[] = new String [] {"[5, 2, 3, 3, 5, 7, 8]", "[2, 2, 3, 10, 6]"};
        System.out.println("In ra ket qua: ");
        System.out.println(add2array(arrStr));
    }
}



