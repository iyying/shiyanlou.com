package com.shiyanlou.course;

import java.util.Scanner;

public class StringTools {
    public static void main(String[] args) {
        String a = new String();
        String b = new String();
        String c = new String();

        Scanner scan = new Scanner(System.in);
        System.out.println("Please input a sentence with 10 more letters include space(s) : ");

        a = scan.nextLine();
        b = a.trim();

        if(b.equals("shiyanlou"))
            c = b.substring(0, 6);
        else {
            c = "";
        }

        System.out.println("a :"+a);
        System.out.println("The length of a is :"+a.length());
        System.out.println("b :"+b);
        System.out.println("The length of b is :"+b.length());
        System.out.println("c :"+c);
        System.out.println("The length of c is :"+c.length());

    }
}
