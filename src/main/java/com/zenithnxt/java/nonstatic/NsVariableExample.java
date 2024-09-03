package com.zenithnxt.java.nonstatic;

public class NsVariableExample {

    // non static variable
    int a=20;

    public static void main(String[] args) {

        NsVariableExample a= new NsVariableExample();
        System.out.println(a);//address
        System.out.println(a.a);
    }
}
