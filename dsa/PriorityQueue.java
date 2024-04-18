package dsa;

import java.util.Arrays;

public class PriorityQueue {
    int[] item = new int[4];
    private int front;
    private int count;
    public void enqueue(int num){
        if(count == item.length)
            throw  new IllegalStateException();
        int i;
        //shifting elements from the back
        for(i =count-1;i>=0;i--) {
            if (item[i] > num)
                item[i + 1] = item[i];
            else
                break;
        }
                item[i+1] = num;
        count++;
    }

    public int remove(){
        return item[--count];
    }


    @Override
    public String toString() {
        return Arrays.toString(item);
    }
}
