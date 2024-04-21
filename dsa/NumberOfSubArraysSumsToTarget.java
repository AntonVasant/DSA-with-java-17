package dsa;

import java.util.HashMap;

public class NumberOfSubArraysSumsToTarget {
    public int subArray(int[] array,int target){
        int count=0;
        int sum=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for (int num : array){
            sum += num;
            if(map.containsKey(sum-target)){
                count+= map.get(sum-target);
            }
            map.put(sum,map.getOrDefault(num,0)+1);
        }
        return  count;
    }
}
