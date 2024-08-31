package com.zenithnxt.java.staticMember;

public class SBExample2 {
    static int a=10;

    static
    {
        int a=19;
        SBExample2.a=20;
    }
    public static void main(String[] args) {
        System.out.println(a);
    }
}
