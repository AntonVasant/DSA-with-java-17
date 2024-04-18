package dsa;

import java.util.ArrayList;
import java.util.List;

public class NumberOfSubArray {
    public List<List<Integer>> subArrays(int arr[],int k) {
         List<List<Integer>> lists = new ArrayList<>();
         for(int i=0;i<arr.length;i+=k){
             int endIndex = Math.min(i+k,arr.length);
             List<Integer> list = new ArrayList<>();
             for(int j=i;j<endIndex;j++){
                 list.add(arr[j]);
             }
             lists.add(list);
         }
         return lists;
    }



}
