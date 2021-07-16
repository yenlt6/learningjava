package learning.method02;

import java.util.Scanner;

public class Math {

    public void run() {
        Math math = new Math();
        int number[] = {1, 2, 3, 4, 5, 6, 7, 8};
        //Math.average(number);

        //Math.reverseArray(number);
        //Math.countOddNumber(number);
        math.oddNumberArray(number);
    }


    public static float average(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println("Tong cua mang dua vao: " + sum);
        return sum;
    }


    public static int[] reverseArray(int[] numbers) {
        int length = numbers.length;

        int reverse[] = new int[length];
        for (int i = 0; i < numbers.length; i++) {
            //      reverse[0]=5;
            reverse[i] = numbers[length - i - 1];
        }

        // accessing the elements of the specified array
        for (int i = 0; i < reverse.length; i++)
            System.out.println("Element at index " + i +
                    " : " + reverse[i]);

        return null;
    }

    // Đếm số lẻ trong một mảng
    public static int countOddNumber(int[] numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                count++;
            }
        }
        System.out.println("Ma Cho co " + count + " So Le");
        return count;
    }

    //Trả về mảng chỉ gồm các số lẻ. Ví dụ đầu vào 1, 2, 4, 5, 3 thì trả về [1, 5, 3]
    public int[] oddNumberArray(int[] numbers) {
        int leng = countOddNumber(numbers);
        int count = 0;
        int sole[] = new int[leng];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                sole[count] = numbers[i];
                count++;
            }
        }

        for (int i = 0; i < sole.length; i++) {
            System.out.println(" Phan tu thu " + i + "cua mang la: " + sole[i]);
        }

        return null;
    }
  /* Dựa vào chỉ số BMI hãy trả về các đánh giá: Nhẹ cân, Bình thường, Quá cân, Rất nguy hiểm
  BMI	      Đánh giá
  Dưới 18.5	Nhẹ cân
  18.5—24.9	Bình thường
  25.0—29.9	Quá cân
  30.0      Rất nguy hiểm
  */
    //  public String bmiRating(float height, float weight) {
    //
    //  }
    //


    public static void runExample() {
        System.out.println("Chào các bạn lớp Java 4");
        Math math = new Math();
        //Math là tên của class. Tên của Class luôn bắt đầu bằng chữ Hoa
        //math là tên của object
        System.out.println(math.isOdd(4));

        float weight = 74f;
        float height = 1.76f;
        System.out.println("Chỉ số BMI của thầy Cường " + math.calculateBMI(height, weight));

        float diameter = 3.0f;
        System.out.println("Chu vi của hình tròn có đường kính "
                + diameter + " = "
                + math.circlePerimeter(diameter));

        float x = 5.0f;
        float y = 3.0f;
        float z = 2.0f;
        if (math.isTriangle(x, y, z)) {
            System.out.println("x : " + x + ", y : " + y + ", z : " + z + " tạo thành một tam giác");
        } else {
            System.out.println("x : " + x + ", y : " + y + ", z : " + z + " không tạo thành một tam giác");
        }

        System.out.println("Số nhỏ nhất trong x: " + x
                + ", y: " + y
                + ", z: " + z
                + " là " + math.smallestIn3Numbers(x, y, z));

        int[] intArray = new int[]{1, 2, 3};
        System.out.println("Tổng của một mảng " + math.sum(intArray));

    }


    public boolean isOdd(int x) {//int x là tham số truyền vào, method parameter
        return x % 2 != 0;
    }

    public boolean isEven(int x) {
        return x % 2 == 0;
    }

    public float calculateBMI(float height, float weight) {
        return weight / (height * height);
    }

    public float circlePerimeter(float diameter) {
        return diameter * 3.14f;
    }

    public boolean isTriangle(float x, float y, float z) {
        return ((x + y > z) && (y + z > x) && (x + z > y));
    }

    public void nhap() {
        char exit = 'a';
        while (exit != 'q') {
            Scanner scanner = new Scanner(System.in);
            float weight;
            float height;
            System.out.println("nhap can nang: ");
            weight = scanner.nextFloat();
            System.out.println("nhap chieu cao: ");
            height = scanner.nextFloat();
            System.out.println(" Chir so BMI:" + bmiCalculate(weight, height));
        }
    }

    public float bmiCalculate(float weight, float height) {

        return weight / (height * height);
    }


    
    /* cách này hơi dài dòng
    if ((x + y > z) && (y + z > x) && (x + z > y)) {
      return true;
    } else {
      return false;
    }*/


    public float smallestIn2Numbers(float x, float y) {
    /*
    if (x < y) {
      return x;
    } else {
      return y;
    }*/
        //Ternary operation
        return (x < y) ? x : y;
    }

    public float smallestIn3Numbers(float x, float y, float z) {
        //return smallestIn2Numbers(smallestIn2Numbers(x, y), z);
    /* Cách của anh Khanh chưa đúng
    float min = x;
    if(min > y){
      min = y;
    } else if (min > z){
      min = z;
    }
    return min;
    */

        // Cách của Minh An
        if (x < y) {
            if (x < z) {
                return x;
            } else {
                return z;
            }
        } else { //x > y
            if (y < z) {
                return y;
            } else {
                return z;
            }
        }

    }

    //Lời giải của Minh An
    public float sum(int[] numbers) {
        float sum = 0f;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }
//
//  public float average(int[] numbers) {
//    return 0.0f;
//  }
//
//  public int[] reverseArray(int[] numbers) {
//    return null;
//  }
//
//  // Đếm số lẻ trong một mảng
//  public int countOddNumber(int[] numbers) {
//    return 0;
//  }
//
//  //Trả về mảng chỉ gồm các số lẻ. Ví dụ đầu vào 1, 2, 4, 5, 3 thì trả về [1, 5, 3]
//  public int[] oddNumberArray(int[] numbers) {
//    return null;
//  }
//  /* Dựa vào chỉ số BMI hãy trả về các đánh giá: Nhẹ cân, Bình thường, Quá cân, Rất nguy hiểm
//  BMI	      Đánh giá
//  Dưới 18.5	Nhẹ cân
//  18.5—24.9	Bình thường
//  25.0—29.9	Quá cân
//  30.0      Rất nguy hiểm
//  */
////  public String bmiRating(float height, float weight) {
////
////  }


}

