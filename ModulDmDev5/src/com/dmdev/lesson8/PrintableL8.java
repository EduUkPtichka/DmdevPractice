package com.dmdev.lesson8;

import java.util.Random;

public interface PrintableL8 {

    String SOME_VALUE = "Example";
    //String SOME_VALUEv1; // Необходимо сразу инициализовать!

    Random RANDOM = new Random(); //Константа!

    default void printRelazezes(){
        // Random random = new Random();
        //System.out.println(RANDOM.nextInt());
        System.out.println(generateRandom());
        print();
    }
    void print();

    //В Интерфейсе можно создавать статические методы!
//    static int generateRandom(){
//        return RANDOM.nextInt();
//        //Доступ из вне, т.е. через обращение точка.
//    }

    private int generateRandom(){
        return RANDOM.nextInt();
        //Теперь из-за private, мы не можем нарушить принципы интерефейсов через обращения точку.
    }
}
