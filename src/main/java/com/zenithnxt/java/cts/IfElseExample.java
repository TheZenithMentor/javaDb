package com.zenithnxt.java.cts;

public class IfElseExample {
    public static void main(String[] args) {
        int a=50;
        int b=14;
        int c=8;

        // maximum between 3 number

        if(a>b)  // 4>5
        {
            if(a>c) //5>8
                {
                    System.out.println("max number "+a);
                }
            else {
                System.out.println("max number  "+c);
            }
        }
        else
        {
            if(b>c)
            {
                System.out.println("max number "+b);
            }
            else {
                System.out.println("max number "+c);
            }
        }
    }
}


 // min of 3 number