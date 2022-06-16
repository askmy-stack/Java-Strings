package com.company;

public class Practice {
    public static void main(String[] args) {
        String a = "12.34567";
        System.out.println(FloatPatternSearching(a));
    }
    public static String FloatPatternSearching(String a){
        int b = a.indexOf('.');
        if (b<0){
            return "";
        }
        else{
            return a.substring(b+1);
        }
    }
 }
