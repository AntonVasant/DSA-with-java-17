package dsa;

import java.util.ArrayList;

public class SumsToKArray {
    public ArrayList<Integer> sum(int[] array,int k){
        ArrayList<Integer> list = new ArrayList<>();
        int first=0;
        int second =0;
        int lengths = array.length;
        int currentSum=0;
        while(first<lengths){
            if(k == array[first]) {
                list.add(first);
                return list;
            }
            if(currentSum == k)
                return list;
            currentSum+=array[first];
            list.add(first);
            first++;
            if(currentSum>k){
                currentSum-=array[second];
                list.remove(second);
                second++;
            }
        }
        return list;
    }
}
