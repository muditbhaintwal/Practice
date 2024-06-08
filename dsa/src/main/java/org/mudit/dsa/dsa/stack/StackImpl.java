package org.mudit.dsa.dsa.stack;

public class StackImpl<V> implements Stack<V> {
    private int capacity = 1;
    private Object[] arr = new Object[capacity];

    @Override
    public V peek() {
        return (V) arr[getItemsCount() - 1];
    }

    @Override
    public V pop() {
        int itemsCount = getItemsCount();
        if (itemsCount != 0) {
            V v = (V) arr[itemsCount - 1];
            arr[itemsCount - 1] = null;
            return v;
        } else {
            return null;
        }
    }

    @Override
    public void push(V item) {
        int itemsCount = getItemsCount();
        if (itemsCount == capacity) {
            capacity += capacity;
            Object[] newArr = new Object[capacity];
            System.arraycopy(arr, 0, newArr, 0, arr.length);
            newArr[arr.length] = item;
            arr = newArr;
        } else {
            arr[itemsCount] = item;
        }
    }

    private int getItemsCount() {
        int index = 0;
        for (Object o : arr) {
            if (o == null) {
                break;
            }
            index++;
        }
        return index;
    }
}
