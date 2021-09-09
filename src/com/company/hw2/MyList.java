package com.company.hw2;

public interface MyList<T> {
    void add(T item);

    void add(int index, T item);

    T remove(int index);

    boolean remove(T item);

    boolean isEmpty();

    int indexOf(T item);

    T get(int index);

    void set(int index, T item);

    int size();
}
