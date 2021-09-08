package com.company.hw2;

public class MyArrayList<T> implements MyList<T> {
    private T[] list;
    private int size;
    private int capacity;
    private final int DEFAULT_CAPACITY = 10;

    public MyArrayList(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity <= 0 ");
        }
        this.capacity = capacity;
        list = (T[]) new Object[capacity];
    }

    public MyArrayList() {
        this.capacity = DEFAULT_CAPACITY;
        list = (T[]) new Object[capacity];
    }

    @Override
    public void add(Object item) {
        checkLoadFactor(size);
        list[size] = (T) item;
        size++;
    }

    @Override
    public void add(int index, T item) throws ArrayIndexOutOfBoundsException {
        checkLoadFactor(size);
        if (!checkIndex(index)) throw new ArrayIndexOutOfBoundsException();
        for (int i = size; i > index; i--) {
            list[i] = list[i - 1];
        }
        list[index] = item;
        size++;
    }

    @Override
    public final T remove(int index) throws ArrayIndexOutOfBoundsException {
        if (!checkIndex(index)) throw new ArrayIndexOutOfBoundsException();
        T temp = list[index];
        for (int i = index; i < size; i++) {
            list[i] = list[i + 1];
        }
        size--;
        list[size] = null;
        return temp;
    }

    @Override
    public boolean remove(T item) {
        int i = indexOf(item);
        if (i == -1) {
            return false;
        }
        remove(i);
        return true;
    }

    @Override
    public int indexOf(T item) {
        for (int i = 0; i < size; i++) {
            if (list[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public T get(int index) throws ArrayIndexOutOfBoundsException {
        if (!checkIndex(index)) throw new ArrayIndexOutOfBoundsException();
        return list[index];
    }

    @Override
    public void set(int index, T item) throws ArrayIndexOutOfBoundsException {
        if (!checkIndex(index)) throw new ArrayIndexOutOfBoundsException();
        list[index] = item;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    private boolean checkIndex(int index) {
        return index < size;
    }

    private void checkLoadFactor(int size) {
        if (size > (capacity * 0.7)) {
            capacity *= 2;
            T[] tmp = (T[]) new Comparable[capacity];
            System.arraycopy(list, 0, tmp, 0, list.length);
            list = tmp;
        }
    }
}
