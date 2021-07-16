package learning.loop1705;

import java.util.Scanner;

public class LearnLoop {
    //viet chuong trinh nhap tu ban phim, se dung khi nhap vao chu 'q'
    public static void enterFromKeyboard(){
        Scanner scanner = new Scanner(System.in);
        String text ="o";

        while (true){
            System.out.println("nhap vao tu ban phim, an 'q' de thoat");
            text = scanner.nextLine();
            if(text.equals("q")){
                break;
            }
        }

    }

    public static void enterFromKeyboard1(){
        Scanner scanner = new Scanner(System.in);
        String text ="o";

        while (!text.equals("q")){
            System.out.println("nhap vao tu ban phim, an 'q' de thoat");
            text = scanner.nextLine();
                    }

    }
}
