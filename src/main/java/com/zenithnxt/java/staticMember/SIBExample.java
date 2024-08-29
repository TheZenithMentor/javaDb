package com.zenithnxt.java.staticMember;

public class SIBExample {

    public static void main(String[] args) {
        System.out.println("main method");
    }
    static
    {
        System.out.println("SIB-1");
    }
    static
    {
        System.out.println("SIB-2");
    }

}


// static block executes before the execution of main method begins