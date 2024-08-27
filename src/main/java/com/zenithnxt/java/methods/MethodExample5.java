package com.zenithnxt.java.methods;

public class MethodExample5 {
    public static String login(String name)
    {
        return name;
    }

    public static String authentication(long id)
    {
        String name=login("Rajeev");
        return name+"session id "+id;
    }

    public static void main(String[] args) {
        Long sessionId=5643l;
        String res=authentication(sessionId);
        System.out.println(res);
    }
}
