package com.jinisha.service;


import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapFilter {
    public static void main(String[] args) {
        List pj=new ArrayList();
        //stream does not hold data it only pulls data
        //reduce lambda must be associative

        System.out.println(Stream.of("Love is blind","It sucks"));
        System.out.println(IntStream.of(1,2,3,4).filter(i->i>1).count());
        //Stream Builder
        //findfirst
        //findany
        //Checked exception on code

    }
}
