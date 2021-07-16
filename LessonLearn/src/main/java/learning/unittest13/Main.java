package learning.unittest13;

public class Main {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 10, 40 };
        int x = 10;
        LinearSearch linearSearch = new LinearSearch(arr);
        int result = linearSearch.getPositionOfNumber(x);
        if (result == -1)
            System.out.print(
                    "Element is not present in array");
        else
            System.out.print("Element is present at index "
                    + result);
    }
}
