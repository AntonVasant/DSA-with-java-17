package dsa;

import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

public class ArrayQueue {
    private int[] item;
    private int front;
    private int rear;
    private int count ;

    public ArrayQueue(int length) {
        item = new int[length];
    }

    // reversing using a stack
    public void reverse(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty())
            stack.push(queue.remove());
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }

    // implementation of queue using array

    public void enqueue(int n) {
        if (item.length == count)
            throw new IllegalArgumentException();
        count++;
        item[front] = n;
        front = (front + 1) % item.length;

    }

    public int dequeue() {
        var n = item[rear];
        item[rear] = 0;
        rear = (rear + 1) % item.length;
        count--;
        return n;
    }

    @Override
    public String toString() {
        return Arrays.toString(item);
    }
}
