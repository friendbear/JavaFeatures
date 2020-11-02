package com.jff.java12.stringhandling;



public class StringHandlingDemo {
    public static void main(String[] args) {

        indentExample();
        transformExample();

    }
    private static void indentExample(){

        var jff= "Learn Java Straightforward \n Join Java Fast Forward";
        System.out.println(jff.indent(60));

        System.out.println(jff.indent(10));

    }
    private static void transformExample(){

        var jff=  "Java".transform(str -> str + "Fast-Forward");
        System.out.println(jff);
    }
}
