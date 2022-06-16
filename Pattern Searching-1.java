package com.company;

public class Practice {
    public static void main(String[] args) {
        String a = "Abhinaysai";
        String b = "sai";
        PatternSearching(a,b);
    }
    public static void PatternSearching(String a, String b){
        int c = a.indexOf(b);

        while(c>=0){
            System.out.print(c+ " ");
            c = a.indexOf(b + 1, c);
        }
    }
 }
