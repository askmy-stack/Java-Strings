package com.company;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String:");
        String a  = sc.nextLine();
        System.out.print("The Reverse of the given String:"+ReverseString(a));
    }
    public static String ReverseString(String a){
        StringBuilder c = new StringBuilder(a);
        c.reverse();
        return c.toString();
    }
 }
