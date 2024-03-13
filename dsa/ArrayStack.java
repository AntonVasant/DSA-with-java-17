package dsa;

public class ArrayStack {
    private int[] item;
    private int count = 0;

    public ArrayStack(int length) {
        item = new int[length];
    }

    public void push(int number) {
        if (item.length == count)
            throw new StackOverflowError();

        item[count++] = number;
    }

    public int pop() {
        if (item.length == 0)
            throw new IllegalStateException();
        return item[--count];
    }
}
