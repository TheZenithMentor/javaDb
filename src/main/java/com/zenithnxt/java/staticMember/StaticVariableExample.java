package com.zenithnxt.java.staticMember;

public class StaticVariableExample {

    static int a=10; // global area

    public static void main(String[] args) {
        int a=20;
        System.out.println(a); // directly
        System.out.println(StaticVariableExample.a); // with the help of classname as reference
    }
}
// when local and global variable is of same name.
