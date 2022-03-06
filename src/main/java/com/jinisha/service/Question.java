package com.jinisha.service;

import java.util.*;

public class Question {
    int a;
    int b;
    Question(){

    }

    Question(int a){
    super();
    this.a=a;
    }
    Question(int a,int b){
        super();
        this.a=a;
        this.b=b;
    }
    public static void main(String[] args) {
       /*Parent p = new Child();
//       Parent.staticMethod();
       p = new Parent();
       p.test();
        HashMap<Parent, Integer>map = new HashMap<>();
        map.put(p,1);
        p = new Parent();
        System.out.println(map.get(p));*/

        try{
            System.out.println("int try");
        }finally {
            System.out.println("in finally");
        }

    }

}
