package com.zenithnxt.java.staticMember;

public class StaticMethodExample {
    public static void demo()
    {
        System.out.println("Baburao");
    }

    public static void main(String[] args) {
        demo();

        StaticMethodExample.demo();
    }
}
