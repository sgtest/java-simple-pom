package com.sourcegraph.simple;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Overload<T> {

    Overload() {
    }

    Overload(String value) {
        this();
    }

    Overload(int value) {
        this();
    }

    Overload(T first, List<T> second) {
        this(10);
    }

    Overload(Collection<? extends Double> collection) {
    }

    public T foo() {
        return null;
    }

    private T foo(T src) throws Exception {
        return null;
    }

    static int foo(int bar) throws Exception {
        return bar;
    }

    Overload foo(Long bar) {
        return null;
    }

    static void main() throws Exception {
        new Overload();
        new Overload(10);
        new Overload("hi");
        new Overload<Integer>(1, new ArrayList<Integer>());
        new Overload(new ArrayList<Double>());
        Overload<String> o = new Overload<String>();
        o.foo();
        o.foo("hi");
        o.foo(10L);
        Overload.foo(10);
    }
}