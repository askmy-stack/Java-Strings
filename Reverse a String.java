package com.company;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String:");
        String a  = sc.nextLine();
        String b = " ";
        int c = a.length()-1;
        while(c>=0){
            b = b+a.charAt(c);
            c--;
        }
        System.out.print("The Reverse of the given String is:"+b);
    }
 }
