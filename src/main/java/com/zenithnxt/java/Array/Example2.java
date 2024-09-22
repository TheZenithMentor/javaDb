package com.zenithnxt.java.Array;

public class Example2 {
    public static void main(String[] args) {
        int a[]={10,20,30,50,60};
        System.out.println("length "+a.length);

        // traverse the array
        for(int i=0;i<a.length;i++)
        {
            System.out.println("value at index "+i+ " is :"+a[i]);
        }
    }
}
