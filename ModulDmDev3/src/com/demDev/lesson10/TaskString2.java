package com.demDev.lesson10;

public class TaskString2 {
    public static void main(String[] args) {
        String value = "123 fdsfs fdsfsdf 123";
        String word = "123";

        System.out.println(isStartAndEnd(value,word));
    }

    public static Boolean isStartAndEnd(String target, String word){
        return target.endsWith(word) && target.endsWith(word);
    }
}
