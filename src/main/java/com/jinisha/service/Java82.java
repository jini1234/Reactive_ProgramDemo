package com.jinisha.service;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Java82 {
    public static void main(String[] args) {
        Map<String,Integer>  m=new HashMap<>();
      /*  m.put("JNI",1);
        BiFunction<String,Integer,Integer> bif = (s,i)-> ++i;*/
        Function<String,HashMap<String,Integer>> bif1 = (s)-> new HashMap<>();
      /*  System.out.println("l");
        m.compute("JNI",bif);
        System.out.println(m.get("JNI"));*/
        Map<String,HashMap<String,Integer>> map=new HashMap<>();
        System.out.println(map.computeIfAbsent("JII",bif1).put("Prakhar",5));
        System.out.println("I want to suiside");

//merge maps


    }
}
