package com.jff.java12.switchexp;


enum JavaVersion {
    JAVA7, JAVA8,JAVA9, JAVA10,JAVA11,JAVA12
};
//JAVA8 and JAVA11 display message "LTS"
//    JAVA7, JAVA9, JAVA10,JAVA12 display message "Non-LTS"
// other Java version  display message "Java Version not supported"
public class SwitchExpressionAssignment {


    public static void main(String args[]) {
        JavaVersion javaVersion = JavaVersion.JAVA8;
        String support = "";
        switch (javaVersion) {
            case JAVA7 -> support = "Non-LTS";
            case JAVA8 -> support = "LTS";
            case JAVA9 -> support = "Non-LTS";
            case JAVA10 -> support = "Non-LTS";
            case JAVA11 -> support = "LTS";
            case JAVA12 -> support = "Non-LTS";
            default -> support = "Old Java version";


        }
        System.out.println(javaVersion + " : " + support);
    }
}


