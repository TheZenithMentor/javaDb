package com.zenithnxt.java.methods;

public class MethodExampleAdd {

    public static void add(int b)
    {
        System.out.println("int");
    }

    public static void add(String a )
    {
        System.out.println("String");
    }

    public static void main(String[] args) {

        add("Hello");
        add(10);
    }
}
// method with same name but different argumentsw