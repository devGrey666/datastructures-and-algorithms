package org.example.datastructures.linkedLists;

public class LinkedList<T> implements ILinkedList<T> {
    Node<T> head;
    Integer size;

    public LinkedList() {
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
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (this.head == null) {
            this.head = newNode;
        } else {
            var currentNode = this.head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
        this.size++;
    }

    @Override
    public boolean remove(T data) {
        return false;
    }

    public void display() {
        var currentNode = this.head;
        while (currentNode.next != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.print(currentNode.data);
        System.out.println(", Size : "+ this.size);
    }

    @Override
    public boolean search(Object data) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public int size() {
        return this.size;
    }
}
