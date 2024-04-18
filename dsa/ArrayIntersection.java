package dsa;

import java.util.ArrayList;

public class ArrayIntersection {
    public int[] intersection(int[] arr1,int[] arr2){
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : arr1){
            for(int nums : arr2){
                if(num == nums){
                    list.add(num);
                }
            }
        }
        int[] array = new int[list.size()];
        for(int i=0;i<list.size();i++){
            array[i] = list.get(i);
        }
        return array;
    }
}
