package com.zenithnxt.java.staticMember;

public class SBExample3 {
    static int a=10;
    static boolean b;
    static
    {
        System.out.println(a);
        a=20;
        int a=90;
        System.out.println(a);
    }

    static
    {
        a=5;
    }
    public static void main(String[] args) {
        System.out.println("main method");
        System.out.println(a);
    }
}
