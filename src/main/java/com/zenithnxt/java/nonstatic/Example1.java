package com.zenithnxt.java.nonstatic;

public class Example1 {

    int a;

    // Instance initializer block
    {
       a=2;
    }

    public static void main(String[] args) {
        Example1 obj=new Example1();
        System.out.println(obj.a);
    }
}
