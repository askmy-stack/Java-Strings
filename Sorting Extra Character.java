package com.company;
import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        String a = "abcde";
        String b = "aabcde";
        System.out.println(SortingExtraCharacter(a,b));
    }
    public static char SortingExtraCharacter(String a,String b){
        char[] c = a.toCharArray();
        Arrays.sort(c);

        char[] d = b.toCharArray();
        Arrays.sort(d);

        int n = a.length();
        for (int i = 0; i < n; i++) {
            if(c[i]!=d[i]){
                return d[i];
            }
        }
        return d[n];
    }
 }
