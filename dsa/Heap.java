package dsa;

public class Heap {
    private int[] items = new int[10];
    private int size;

    public void insert(int value){
        if(size == items.length)
            throw new IllegalStateException();
        items[size++] = value;
        var index = index(size);
        var parentIndex = (size -1)/2;
        while( index > 0 && items[index] > items[parentIndex]){
            swap(index,parentIndex);
            index = index(size);
        }
    }

    private int parentIndex(int value){
        return (value -1)/2;
    }

    private int leftChildIndex(int value){
        return (value * 2) +1;
    }
    private int rightChildIndex(int value){
        return (value * 2) +2;
    }

    private int index(int value){
        return value -1;
    }

    private void swap(int first,int second){
        var temp = items[first];
        items[first] = items[second];
        items[second] = temp;
    }
}
