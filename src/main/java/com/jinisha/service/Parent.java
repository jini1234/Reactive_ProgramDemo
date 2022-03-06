package com.jinisha.service;

public class Parent {
    public int num = 1;
    public String s = "34";
    public void test(){
        System.out.println("parent");
    }
    public static void staticMethod(){
        System.out.println("in Parent static");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Parent parent = (Parent) o;

        if (num != parent.num) return false;
        return s != null ? s.equals(parent.s) : parent.s == null;
    }

    @Override
    public int hashCode() {
        int result = num;
        result = 31 * result + (s != null ? s.hashCode() : 0);
        return result;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
