package com.mojospy.movies.controller;

import static java.lang.Character.isDigit;

public class Utils {
    public static boolean isId(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            boolean isNum = isDigit(str.charAt(i));
            sum = isNum ? ++sum : sum;
        }
        return sum == str.length();
    }
}
