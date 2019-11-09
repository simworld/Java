package org.leonardi.bugreport;

import org.apache.commons.lang3.StringUtils;

public class MainTest {

    public static void main (String... args) {
        String testTrim = new String("ciao");

        printTrim(testTrim);

        printTrim(null);


    }


    private static void printTrim(String toPrint) {
        System.out.println(StringUtils.trim(toPrint));
        if (StringUtils.equals(toPrint, "ciao")) {
            System.out.println("e allora suca");
        }
    }


}
