package com.jinisha.service;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Tryout{
    public static void main(String[] args) {
        List<String> exs = new ArrayList();
        exs.add("Nir");
        exs.add("kapil");
        exs.add("Avkash");
        exs.add("Krunal");
        exs.add("abs");
        exs.add(null);
        exs.add(null);
        HashMap<String, Integer> map = new HashMap<>();
        map.put(null, 1);

        List updated = exs.stream().filter(ex->ex.length()==3).map(ex->ex.concat("ex")).collect(Collectors.toList());
        updated.forEach(System.out::println);

//        exs.stream().filter(ex->ex.length()==3).forEach(System.out::println);
//        exs.forEach(System.out::println);

        Optional<String> opt = getT();
        String updatedOpt = opt.map(s -> s.concat("we")).orElse("iuh");

    }

    private static Optional<String> getT() {
        return Optional.of("foij");
    }
}
