package test.generics;

import java.util.ArrayList;

public class ClassHasGenerics<T> {
    private T first;
    private T last;
    public ClassHasGenerics(T first, T last) {
        this.first = first;
        this.last = last;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getLast() {
        return last;
    }

    public void setLast(T last) {
        this.last = last;
    }

    // 对静态方法使用<T>:
    public static <K> ClassHasGenerics<K> create(K first, K last) {
        return new ClassHasGenerics<K>(first, last);
    }

    public <E> void find(E e) {

    }

    public static void main(String[] args) {

    }
}
