package com.zenithnxt.java.nonstatic.constructor.Example1;

public class Example1 {

    //consctuctor
    Example1(int a)
    {
        System.out.println("Constructor called ");
    }
    Example1(String s)
    {
        System.out.println("constructoe with string args");
    }

    public static void main(String[] args) {
        System.out.println(1);
        Example1 obj=new Example1(10);
        System.out.println(2);
    }
}
