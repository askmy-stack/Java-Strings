package com.company;

public class Practice {
    public static void main(String[] args) {
        String a = "abcde";
        String b = "aabcde";
        System.out.println(BitwiseExtraCharacter(a,b));
    }
    public static char BitwiseExtraCharacter(String a,String b){
       int n = 0;

       int c = a.length();

        for (int i = 0; i < c; i++) {
            n = n^b.charAt(n);

            return (char) n;
        }
        return 0;
    }
 }
