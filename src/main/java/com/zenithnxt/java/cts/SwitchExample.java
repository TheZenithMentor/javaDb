package com.zenithnxt.java.cts;

public class SwitchExample {
    public static void main(String[] args) {
        char day='d';

        switch(day)
        {
            case 'a' : {
                System.out.println(1);
                break;
            }
            case 'b' :
            {
                System.out.println(2);
                break;
            }
            default :
            {
                System.out.println("default block runs");

            }
        }

    }
}
