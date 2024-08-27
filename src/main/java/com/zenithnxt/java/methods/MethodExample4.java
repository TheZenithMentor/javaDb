package com.zenithnxt.java.methods;

public class MethodExample4 {

    public static int add(int a , int b)
    {
        int c=a+b;
        return c;
    }

    public static void main(String[] args) {
       // use
        System.out.println(add(5,4));

        // save
        int res=add(6,5);
        System.out.println(res);
    }
}
