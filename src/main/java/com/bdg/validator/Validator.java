package com.bdg.validator;

public class Validator {


    //testing
    public static void checkId(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("'id' must be a positive number: ");
        }
    }

        //added comment
    public static void checkNull(Object item) {
        if (item == null) {
            throw new NullPointerException("Passed null value as 'item': ");
        }
    }


    public static void validateString(String str) {
        checkNull(str);
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Passed empty value as 'str': ");
        }
    }
}