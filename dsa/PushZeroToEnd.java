package dsa;

import java.util.Arrays;

public class PushZeroToEnd {
    public void empty(int[] arr) {
        int n = arr.length;
        int[] array = new int[n];
        int count = 0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                array[count++] = arr[i];

            }
        }
        for (int i = count; i < n; i++) {
            array[i] = 0;
        }
        System.out.println(Arrays.toString(array));

    }
}
