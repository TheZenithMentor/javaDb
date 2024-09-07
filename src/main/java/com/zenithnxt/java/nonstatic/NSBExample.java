package com.zenithnxt.java.nonstatic;

public class NSBExample {

    // ns block
    {
        System.out.println("NSB-1");
    }

    public static void main(String[] args) {
        System.out.println("main mmethod");
        NSBExample ref=new NSBExample();
    }

    // ns block
    {
        System.out.println("NSB-2");
    }
}
