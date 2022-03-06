package com.jinisha.service;

import java.sql.SQLOutput;

public class Palindrom {
    public static void main(String[] args) {
        String w="jini";
        System.out.println(checkPalindrom(w));

    }
    public static boolean checkPalindrom(String s){

        if(s.length()==1){
            return true;
        }
        if(s.charAt(0)==s.charAt(s.length()-1) ){
            checkPalindrom(s.substring(0,s.length()-1));
        }
        else{
            return false;
        }
        return true;
    }
}
