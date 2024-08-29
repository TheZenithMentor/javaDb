package com.zenithnxt.java.staticMember;

public class StaticVariableExample {

    static int a; // global area

    public static void main(String[] args) {
        int a=20;
        System.out.println(a); // directly
        System.out.println(StaticVariableExample.a); // with the help of classname as reference
        System.out.println(SB2.c);
    }
}
// when local and global variable is of same name
