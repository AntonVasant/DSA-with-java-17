package dsa;

import java.util.ArrayList;

public class KthLargestDivisor {
    public int divisor(int number,int k){
        if(number==0)
            return 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=1;i<=number/2;i++){
            if(number%i==0)
                list.add(i);
        }
        if(k>list.size())
            return -1;
        return list.get(k-1);
    }
}
