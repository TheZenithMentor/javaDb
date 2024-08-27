package com.zenithnxt.java.cts;

public class ElseIfLadderExample {
    public static void main(String[] args) {
        int a = 6;
        if (a < 5) {
            System.out.println(1);
        } else if (a < 7) {
            System.out.println(2);
        } else if (a < 8) {
            System.out.println(3);
        }

    }
}
// it will keep checking until the condition become true , once true then it will not check the remaining else if condition and came  out from the ladder