package org.basic.utils;

public final class StringUtils {
    
    public static final String EMPTY_STRING = "";
    public static final String SPACE = " ";
    
    private StringUtils() {
        // private constructor
    }
    
    public static boolean isEmptyString(String value) {
        return value == null || value.length() == 0;
    }
    
}
