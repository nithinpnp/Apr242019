package com.microsoft.pnp;

// holder interface with method behavior
public interface IHolder<T> {

    T getNext();

    void setVal(T val);

    T getVal();

    T getDefaultVal();

    boolean maxReached();
}
