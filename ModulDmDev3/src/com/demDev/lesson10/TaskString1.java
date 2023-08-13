package com.demDev.lesson10;

public class TaskString1 {
    public static void main(String[] args) {

        String value = "Ходил он ;(, кушал он ;(, и был он всегда ;(!";
        String result = replace(value);
        System.out.println(result);
    }

    public static String replace(String value){
        String result = value.replace(";(", ":)");
        return result;
    }
}


