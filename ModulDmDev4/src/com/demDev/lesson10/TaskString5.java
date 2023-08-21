package com.demDev.lesson10;

import java.util.Arrays;

//https://dmdev.getcourse.ru/pl/teach/control/lesson/view?id=239623489&editMode=0
public class TaskString5 {
    public static void main(String[] args) {
        String value = "589098431908";
        int n = 3;
        String[] result = split(value, n);
        System.out.println(Arrays.toString(result));


    }

    public static String[] split(String value, int n) {
        int arraySize = (int) Math.ceil(value.length() / (double) n);
        String[] result = new String[arraySize];

        int counter = 0;
        for (int i = 0; i < value.length(); i += n) {
            int endIndex = value.length() > i + n ? i + n : value.length();
            String substring = value.substring(i, endIndex);  //i + n);
            result[counter] = substring;
            counter++;
        }
        return result;
    }
}
