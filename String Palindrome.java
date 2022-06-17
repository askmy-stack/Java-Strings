package com.company;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String a  = sc.nextLine();
        int start = 0;
        int end = a.length()-1;
        boolean isPal = true;
        while (start<end){
            if(a.charAt(start)!=a.charAt(end)){
                isPal = false;
                break;
            }
            start++; end--;
        }
        if(isPal == true){
            System.out.print("The String is a Palindrome");
        }
        else{
            System.out.print("The String is not a Palindrome");
        }
    }
 }
