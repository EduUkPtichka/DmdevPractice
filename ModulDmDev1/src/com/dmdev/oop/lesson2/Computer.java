package com.dmdev.oop.lesson2;

public class Computer {

    // поля класса или как еще называют состояние класса
    int ssd = 900;
    int ram = 1024;

    void load() {
        System.out.println("Рагружено!");

    }

    void printloadC() {
        load();
        System.out.println("Ssd" + ssd);
        System.out.println("Ram" + ram);

    }
}
