package learning.unittest13;

public class LinearSearch {
    private int[] data;

    LinearSearch(int[] arr){
        this.data = arr;
    }

    int getPositionOfNumber(int value){
        int n = data.length;
        for(int i = 0; i < n; i++)
        {
            if(data[i] == value)
                return i;
        }
        return -1;
    }

}
