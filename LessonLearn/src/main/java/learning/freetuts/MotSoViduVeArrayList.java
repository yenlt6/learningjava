package learning.freetuts;

import java.util.*;

public class MotSoViduVeArrayList {
    //Java - Tìm và hiển thị phần tử lớn nhất trong 1 ArrayList.
    public void findMax(){
        ArrayList<Integer> arrListInteger = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int number; // phần tử của mảng

        System.out.println("Nhập số phần tử của ArrayList: ");
        int n = scanner.nextInt();

        // nhập và thêm phần tử cho ArrayList
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i +": ");
            number = scanner.nextInt();
            arrListInteger.add(number);
        }

        // tìm phần tử lớn nhất trong mảng
        // sử dụng phương thức compareTo()
        // giả sử phần tử lớn nhất là phần tử đầu tiên trong ArrayList
        int max = arrListInteger.get(0);

        for (int i = 1; i < arrListInteger.size(); i++) {
            // nếu kết quả của phép so sánh này lớn hơn 0
            // tức biến max nhỏ hơn phần tử tại vị trí thứ i trong ArrayList
            // thì gán max = phần tử tại vị trí i
            // và đó chính là phần tử lớn nhất
            if (arrListInteger.get(i).compareTo(max) > 0) {
                max = arrListInteger.get(i);
            }
        }
        System.out.println("Phần tử lớn nhất trong arrListInteger = " + max);
    }

//    Java - Viết chương trình tạo 1 ArrayList mới từ 1 ArrayList đã tồn tại.
    public void example2(){
        int n;  // số phần tử của ArrayList
        int number;
        ArrayList<Integer> arrListInteger = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số phần tử của ArrayList: ");
        n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            number = scanner.nextInt();
            arrListInteger.add(number);
        }

        // tạo 1 ArrayList mới
        // có số phần tử bằng với số phần tử của arrListString
        ArrayList<Integer> arrNewList = new ArrayList<>(arrListInteger.size());

        // duyệt các phần tử trong arrListInteger
        // nếu có phần tử nào trong arrListInteger đã tồn tại trong arrNewList
        // thì không thêm vào trong arrNewList
        // ngược lại thì thêm vào bình thường
        for (int str : arrListInteger) {
            if (!arrNewList.contains(str)) {
                arrNewList.add(str);
            }
        }

        System.out.print("Các phần tử có trong arrListInteger là: ");
        System.out.println(arrListInteger);
        System.out.print("\nCác phần tử có trong arrNewList là: ");
        System.out.println(arrNewList);
    }
    //Java - Viết chương trình loại bỏ các phần tử trùng nhau trong 1 ArrayList.
    public void example3(){
        int number;
        ArrayList<Integer> arrListNumber = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            number = scanner.nextInt();
            arrListNumber.add(number);
        }

        // tạo 1 ArrayList arrTemp
        ArrayList<Integer> arrTemp = new ArrayList<>();

        // thêm các phần tử của arrListNumber vào arrTemp
        // nếu trong arrTemp đã tồn tại phần tử giống trong arrListNumber
        // thì không thêm vào, ngược lại thêm bình thường
        for (int i = 0; i < arrListNumber.size(); i++) {
            if (!arrTemp.contains(arrListNumber.get(i))) {
                arrTemp.add(arrListNumber.get(i));
            }
        }

        // xóa các phần tử của arrListNumber
        arrListNumber.clear();

        // thêm tất cả các phần tử của arrTemp vào arrListNumber
        // lúc này ta sẽ có 1 ArrayList arrListNumber
        // không chứa các phần tử trùng nhau
        arrListNumber.addAll(arrTemp);

        System.out.println("Các phần tử có trong arrListNumber là: ");
        System.out.println(arrListNumber);
    }
//    Java - Tính và hiển thị tổng các phần tử của ArrayList.
    public void example4(){
        int n;
        double number, sum = 0;
        ArrayList<Double> arrListDouble = new ArrayList<>();
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Nhập vào số phần tử của ArrayList: ");
        n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            number = scanner.nextDouble();
            arrListDouble.add(number);
        }

        // tính tổng các phần tử của arrListDouble
        for (double element : arrListDouble) {
            sum += element;
        }
        System.out.println("Tổng của các phần tử trong arrListDouble = " + sum);
    }
    public void example5(){
        String str; // phần tử của ArrayList 1
        int number; // phần tử của ArrayList 2
        Scanner scanner = new Scanner(System.in);

        // tạo 2 ArrayList mới
        ArrayList<String> arrListA = new ArrayList<>();
        ArrayList<Integer> arrListB = new ArrayList<>();

        // nhập vào 5 phần tử cho 2 ArrayList này
        System.out.println("Nhập phần tử là các chuỗi cho ArrayList 1: ");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nhập phần tử thứ " + i +": ");
            str = scanner.nextLine();
            arrListA.add(str);
        }

        System.out.println("Nhập phần tử là các số nguyên cho ArrayList 2: ");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nhập phần tử thứ " + i +": ");
            number = Integer.parseInt(scanner.nextLine());  // hạn chế hiện tượng trôi lệnh
            arrListB.add(number);
        }

        // hiển thị các phần tử của 2 ArrayList sử dụng Iterator
        Iterator<String> iteratorA = arrListA.iterator();
        System.out.println("Các phần tử của arrListA là: ");
        while (iteratorA.hasNext()) {
            System.out.print(iteratorA.next() + "\t");
        }

        Iterator<Integer> iteratorB = arrListB.iterator();
        System.out.println("\nCác phần tử của arrListB là: ");
        while (iteratorB.hasNext()) {
            System.out.print(iteratorB.next() + "\t");
        }

        // Tìm kiếm vị trí xuất hiện đầu tiên và cuối cùng
        // của 1 phần tử bất kỳ trong arrListA
        // trong trường hợp trong ArrayList chỉ có 1 phần tử có giá trị cần tìm
        // thì vị trí xuất hiện đầu tiên và cuối cùng của phần tử đó trùng nhau.
        System.out.println("\nNhập phần tử cần tìm: ");
        String strSearch = scanner.nextLine();
        if (arrListA.contains(strSearch)) {
            int firstPosition = arrListA.indexOf(strSearch);
            int lastPosition = arrListA.lastIndexOf(strSearch);
            System.out.println("Vị trí xuất hiện đầu tiên và cuối cùng của " + strSearch
                    + " là " + firstPosition + " và " + lastPosition);
        } else {
            System.out.println("Không tìm thấy phần tử " + strSearch);
        }

        // Tạo 1 List có các phần tử được tách từ vị trí số 3 trong ArrayList 2.
        // sử dụng phương thức subList()
        // trong đó 3 là vị trí bắt đầu lấy và kết thúc tại arrListB.size() - 1
        List<Integer> subList = arrListB.subList(3, arrListB.size());
        System.out.println("Các phần tử có trong subList là: " + subList);

        // Đảo ngược các phần tử trong 2 ArrayList này
        // sử dụng phương thức Collections.reverse()
        Collections.reverse(arrListA);
        System.out.println("Các phần tử trong arrListA sau khi đảo ngược: " + arrListA);
        Collections.reverse(arrListB);
        System.out.println("Các phần tử trong arrListB sau khi đảo ngược: " + arrListB);

        // Xáo trộn các phần tử trong ArrayList 1
        // sử dụng phương thức Collections.shuffle()
        // kết quả của mỗi lần sẽ khác nhau
        Collections.shuffle(arrListA);
        System.out.println("Các phần tử trong arrListA sau khi xáo trộn: " + arrListA);

        // Chuyển ArrayList 2 thành mảng và hiển thị các phần tử của mảng
        // sử dụng phương thức toArray()
        Object[] array = arrListB.toArray();
        System.out.println("Các phần tử của mảng array là: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
