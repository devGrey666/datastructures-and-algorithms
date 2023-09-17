package org.example.datastructures.linkedLists;

public interface ILinkedList<T> {
    void add(T data);

    boolean remove(T data);

    boolean search(T data);

    boolean isEmpty();

    int size();
}
