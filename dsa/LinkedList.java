package dsa;

import java.util.NoSuchElementException;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size = 0;

    private boolean isEmpty() {
        return first == null;

    }

    public void addLast(int item) {
        size++;
        var node = new Node(item);
        if (isEmpty())
            first = last = node;
        else {
            last.next = node;
            last = node;
        }
    }

    public void addFirst(int value) {
        size++;
        var node = new Node(value);
        if (isEmpty())
            first = last = node;
        else {
            first.next = node;
            first = node;
        }
    }

    public int indexOf(int item) {
        int index = 0;
        var current = first;
        while (current != null) {
            if (current.value == item)
                return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    public void removeFirst() {
        if (isEmpty())
            throw new NoSuchElementException();
        size--;

        if (first == last) {
            first = last = null;
            return;
        }
        var second = first.next;
        first.next = null;
        first = second;
    }

    public void removeLast() {
        if (isEmpty())
            throw new NoSuchElementException();
        size--;

        if (first == last) {
            first = last = null;
            return;
        }
        var previous = getPrevious(last);
        last = previous;
        last.next = null;
    }

    private Node getPrevious(Node node) {
        var current = first;
        while (current != null) {
            if (current.next == node)
                return current;
            current = current.next;
        }
        return null;
    }

    public int size() {
        return size;
    }

    public int[] toArray() {
        if (isEmpty())
            throw new NoSuchElementException();

        int[] arr = new int[size];
        int index = 0;
        var current = first;
        while (current != null) {
            arr[index++] = current.value;
            current = current.next;
        }
        return arr;
    }

    public void reverse() {
        var previous = first;
        var current = first.next;
        while (current != null) {
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        last = first;
        last.next = null;
        first = previous;
    }

    public int getKthNode(int k) {
        var a = first;
        var b = first;
        for (int i = 0; i < k - 1; i++) {
            b = b.next;
            if (b == null)
                throw new IllegalArgumentException();
        }
        while (b != null) {
            a = a.next;
            b = b.next;
        }
        return a.value;
    }
}
