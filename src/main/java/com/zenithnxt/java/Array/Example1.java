package com.zenithnxt.java.Array;

public class Example1 {
    public static void main(String[] args) {

        int []totalMarks={10,11,12,15,1};
        System.out.println(totalMarks); // address of array

        //length
        System.out.println("length of array : "+totalMarks.length);

        // first index
        System.out.println("first index value : "+totalMarks[0]);

        // last index
        System.out.println("Last index value "+totalMarks[5]); // ArrayIndexOutOfBoundsException
    }
}
