package com.company;

public class Practice {
    public static void main(String[] args) {
        String a = "slient";
        String b = "listen";
        System.out.println(Anagram(a,b));
    }
    static final int CHAR = 256;
    static boolean Anagram(String a, String b){
       if(a.length()!=b.length())
           return false;

       int count[] = new int[CHAR];
        for (int i = 0; i < a.length(); i++) {
            count[a.charAt(i)]++;
            count[b.charAt(i)]--;
        }
        for (int i = 0; i < CHAR; i++) {
            if (count[i] !=0)
                return false;
        }
        return true;
    }
 }
