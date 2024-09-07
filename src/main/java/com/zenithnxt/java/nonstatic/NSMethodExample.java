package com.zenithnxt.java.nonstatic;

public class NSMethodExample {

    // nsmethod
    public void dance()
    {
        System.out.println("NS method");
    }

    public static void main(String[] args) {

        // object create
        NSMethodExample ref=new NSMethodExample();
        ref.dance();

    }
}
