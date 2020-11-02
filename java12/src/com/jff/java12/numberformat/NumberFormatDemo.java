package com.jff.java12.numberformat;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo {
    public static void main(String[] args) {

        // NumberFormat adds support for formatting a number
        // 1000 can be formatted as "1K"
        // 1000000 can be formatted as "1M",
        // 1000 = 1 हज़ार  (In Hindi)
        display1K();
        display1KIndia(); // In Hindi
        display1KLong();
        display1M();
        display1MLong();

        String jff= "Learn Java Straightforward \n Join Java Fast Forward";
        System.out.println(jff);

        System.out.println(jff.indent(60));

    }

    private static void display1K(){
        NumberFormat fmt = NumberFormat.getCompactNumberInstance();
        String result = fmt.format(1000);
        System.out.println("from display1K: 1000 --> " + result);
        //Output: 1k
    }
    private static void display1KIndia(){

        NumberFormat fmt = NumberFormat.getCompactNumberInstance(new Locale("hi", "IN"), NumberFormat.Style.SHORT);
        String result = fmt.format(1000);
        System.out.println("from display1KIndia: 1000 --> " + result);
        //Output: 1 हज़ार
    }



    private static void display1KLong(){
        NumberFormat fmt = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG);
        String result = fmt.format(1000);
        System.out.println("from display1KLong: 1000 --> " + result);
        //Output: 1 thousand
    }

    private static void display1M(){
        NumberFormat fmt = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
        String result = fmt.format(1000000);
        System.out.println("1000000 --> " + result);

        //Output: 1M
    }
    private static void display1MLong(){
        NumberFormat fmt = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG);
        String result = fmt.format(1000000);
        System.out.println("1000000 --> " + result);

        //Output: 1 million
    }
}
