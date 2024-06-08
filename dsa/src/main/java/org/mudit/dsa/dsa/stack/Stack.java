package org.mudit.dsa.dsa.stack;

public interface Stack<V> {
    V peek();

    V pop();

    void push(V item);
}
