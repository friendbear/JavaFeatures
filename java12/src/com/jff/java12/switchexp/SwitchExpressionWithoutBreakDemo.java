package com.jff.java12.switchexp;

public class SwitchExpressionWithoutBreakDemo {


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
        SwitchExpressionWithoutBreakDemo switchExpressionDemo = new SwitchExpressionWithoutBreakDemo();
        switchExpressionDemo.beforeJava12(JUNE);
        switchExpressionDemo.fromJava12(JUNE);
    }


    public void beforeJava12(String month) {
        String season = "";
        switch (month) {
            // if you miss break
            //  logic will break
            case JANUARY:
                season = "Winter";
               // break;
            case FEBRUARY:
                season = "Summer";
                // break;
            case MARCH:
                season = "Summer";
                //   break;
            case APRIL:
                season = "Summer";
                //   break;
            case MAY:
                season = "Summer";
                //    break;
            case JUNE:
                season = "Rainy";
             //   break;
            case JULY:
                season = "Rainy";
                //     break;
            case AUGUST:
                season = "Rainy";
                //    break;
            case SEPTEMBER:
                season = "Rainy";
                //     break;
            case OCTOBER:
                season = "winter";
                //     break;
            case NOVEMBER:
                season = "winter";
                //    break;
            case DECEMBER:
                season = "winter";
                //      break;

        }
        System.out.println("beforeJava12 Month : " + month + " Season : " +season);

    }
    public void   fromJava12(String month) {
        String season = "";
        switch (month) {
            case JANUARY -> season = "Winter";
            case FEBRUARY -> season = "Summer";
            case MARCH -> season = "Summer";
            case APRIL -> season = "Summer";
            case MAY -> season = "Summer";
            case JUNE -> season = "Summer";
            case JULY -> season = "Rainy";
            case AUGUST -> season = "Rainy";
            case SEPTEMBER -> season = "Rainy";
            case OCTOBER -> season = "Winter";
            case NOVEMBER -> season = "Winter";
            case DECEMBER -> season = "Winter";
        }
        System.out.println("fromJava12 Month : " + month + " Season : " +season);


    }


}
