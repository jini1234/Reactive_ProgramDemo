package com.jinisha.service;

public class Child extends Parent {
    private int num = 2;
    Child(){
    }
    Child(int a){
        super();
        System.out.println("sef");

    }
    public static void staticMethod(){
        System.out.println("in Child static");
    }
    public void test(){
        System.out.println(super.num);
        super.test();
        System.out.println("Child");
    }
}
