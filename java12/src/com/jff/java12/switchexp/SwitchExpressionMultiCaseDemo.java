package com.jff.java12.switchexp;

public class SwitchExpressionMultiCaseDemo {


    final static String JANUARY = "JANUARY";
    final static String FEBRUARY = "FEBRUARY";
    final static String MARCH = "MARCH";
    final static String APRIL = "APRIL";
    final static String MAY = "MAY";
    final static String JUNE = "JUNE";
    final static String JULY = "JULY";
    final static String AUGUST = "AUGUST";
    final static String SEPTEMBER = "SEPTEMBER";
    final static String OCTOBER = "OCTOBER";
    final static String NOVEMBER = "NOVEMBER";
    final static String DECEMBER = "DECEMBER";

    public static void main(String args[]) {
        SwitchExpressionMultiCaseDemo switchExpressionDemo = new SwitchExpressionMultiCaseDemo();
        switchExpressionDemo.beforeJava12(FEBRUARY);
        switchExpressionDemo.fromJava12(FEBRUARY);
    }


    public void beforeJava12(String month) {
        String season = "";
        switch (month) {
            case JANUARY:
                season = "Winter";
                break;
            case FEBRUARY:
            case MARCH:
            case APRIL:
            case MAY:
                season = "Summer";
                break;
            case JUNE:
            case JULY:
            case AUGUST:
            case SEPTEMBER:
                season = "Rainy";
                break;
            case OCTOBER:
            case NOVEMBER:
            case DECEMBER:
                season = "winter";
                break;

        }
        System.out.println("beforeJava12 Month : " + month + " Season : " +season);

    }
    public void   fromJava12(String month) {
        String season = "";
        switch (month) {
            case JANUARY -> season = "Winter";
            case FEBRUARY,MARCH,APRIL,MAY -> season = "Summer";
            case JUNE,JULY,AUGUST,SEPTEMBER -> season = "Rainy";
            case OCTOBER,NOVEMBER,DECEMBER -> season = "Winter";
        }
        System.out.println("fromJava12 Month : " + month + " Season : " +season);


    }


}
