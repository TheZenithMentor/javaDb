package com.zenithnxt.java.staticMember;

public class SBExample4 {
    static int a;
    static
    {
        System.out.println("SIB-1");
        int a=3;
        System.out.println(3);
    }

    public static void test()
    {
        System.out.println(a);
        a=9;
    }

    public static void main(String[] args) {
        System.out.println(a);
    }
}
