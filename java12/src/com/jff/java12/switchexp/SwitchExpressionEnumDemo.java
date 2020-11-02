package com.jff.java12.switchexp;
enum Month {
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
};
public class SwitchExpressionEnumDemo {

    public static void main(String args[]) {
        SwitchExpressionEnumDemo switchExpressionEnumDemo = new SwitchExpressionEnumDemo();
        switchExpressionEnumDemo.beforeJava12(Month.FEBRUARY);
        switchExpressionEnumDemo.fromJava12(Month.FEBRUARY);
    }

    public void beforeJava12(Month month) {
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
            default:
                season = "Invalid Month";
        }
        System.out.println("beforeJava12 Month : " + month + " Season : " +season);

    }
    public void   fromJava12(Month month) {
        String season = "";
        switch (month) {
            case JANUARY -> season = "Winter";
            case FEBRUARY,MARCH,APRIL,MAY,JUNE -> season = "Summer";
            case JULY,AUGUST,SEPTEMBER -> season = "Rainy";
            case OCTOBER,NOVEMBER,DECEMBER -> season = "Winter";
            default -> season = "Invalid Month";
        }
        System.out.println("fromJava12 Month : " + month + " Season : " +season);


    }


}
