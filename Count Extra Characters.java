package com.company;

public class Practice {
    public static void main(String[] args) {
        String a = "abcde";
        String b = "aabcde";
        System.out.println(ExtraCharacter(a,b));
    }
    public static char ExtraCharacter(String a,String b){
       int count[] = new int[26];
       int n = a.length();

        for (int i = 0; i < n; i++) {
            count[b.charAt(i) - 'a']++;
            count[a.charAt(i) - 'a']--;
        }
        count[b.charAt(n)-'a']++;

        for (int i = 0; i < 26; i++) {
            if(count[i] == 1)
                return (char)(i + 'a');
        }
        return 0;
    }
 }
