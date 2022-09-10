package com.company;

public class Shape <T> {
    private T t;
    private String s;

    public void set(T t){
        this.t = t;
    }

    public T get(){
        return t;
    }

    public void setName(String name){
        s = name;
    }
    public String getName(){
        return s;
    }
}
