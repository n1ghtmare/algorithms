package Queues;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Deque<T> implements Iterable<T> {
    private class Node {
        private T data;
        private Node next, prev;

        public Node(T data) {
            this.data = data;
        }
    }

    private Node first, last;
    private int size;

    public int size() { return size; }

    public boolean isEmpty() { return size == 0; }

    public void addFirst(T item) {
        Node n = CreateNode(item);
        if(first == null) {
            first = n;
            last = first;
        }
        else {
            n.next = first;
            first.prev = n;
            first = first.prev;
        }
        size++;
    }

    public void addLast(T item) {
        Node n = CreateNode(item);
        if(last == null) {
            last = n;
            first = last;
        }
        else {
            n.prev = last;
            last.next = n;
            last = last.next;
        }
        size++;
    }

    private Node CreateNode(T item) {
        if(item == null) {
            throw new NullPointerException();
        }
        return new Node(item);
    }

    public T removeFirst() {
        if(first != null) {
            Node temp = first;
            first = first.next;
            first.prev = null;
            size--;
            return temp.data;
        }
        throw new NoSuchElementException();
    }

    public T removeLast() {
        if(last != null) {
            Node temp = last;
            last = last.prev;
            last.next = null;
            size--;
            return temp.data;
        }
        throw new NoSuchElementException();
    }

    public static void main(String[] args) {
        Deque<String> stringDeque = new Deque<String>();
        stringDeque.addFirst("TEST");
        stringDeque.addLast("TEST2");
        stringDeque.addFirst("TEST3");
        stringDeque.addFirst("TEST4");
        stringDeque.addFirst("TEST5");
        stringDeque.addLast("SOME AT THE END");
        stringDeque.addLast("SOME AT THE END 2");
        stringDeque.addLast("SOME AT THE END 3");

        printContents(stringDeque);

        System.out.println("-----");
        System.out.println("REMOVING: ");
        System.out.println(stringDeque.removeFirst());
        System.out.println(stringDeque.removeLast());
        System.out.println(stringDeque.removeLast());
        System.out.println(stringDeque.removeFirst());
        System.out.println("-------");

        printContents(stringDeque);
    }

    private static void printContents(Deque<String> stringDeque) {
        System.out.println(stringDeque.size());
        for(String s : stringDeque) {
            System.out.println(s);
        }
    }

    @Override
    public Iterator<T> iterator() { return new LinkedListIterator(); }

    private class LinkedListIterator implements Iterator<T> {
        private Node current = first;

        @Override
        public boolean hasNext() { return current.next != null; }

        @Override
        public T next() {
            if(!hasNext()) {
                throw new NoSuchElementException();
            }
            Node temp = current;
            current = current.next;
            return temp.data;
        }

        @Override
        public void remove() { throw new UnsupportedOperationException(); }
    }
}
