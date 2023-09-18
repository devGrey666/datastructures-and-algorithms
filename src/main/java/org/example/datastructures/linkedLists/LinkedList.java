package org.example.datastructures.linkedLists;

public class LinkedList<T> implements ILinkedList<T> {
    Node<T> head;
    Integer size;

    public LinkedList(){
        this.head = null;
        this.size = 0;
    }

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    @Override
    public void add(Object data) {

    }


    @Override
    public boolean remove(Object data) {
        return false;
    }

    @Override
    public boolean search(Object data) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }
}
