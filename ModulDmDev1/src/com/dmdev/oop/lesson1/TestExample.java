package com.dmdev.oop.lesson1;

public class TestExample {

    public static void main(String[] args) {
        int value = 10;
        int[] values = {value, 100, 40,44};
        
        printArray(values);
    }

    private static void printArray(int[] values) {
        //iter
        for (int value : values) {
            System.out.println(value);
        }
    }

}
