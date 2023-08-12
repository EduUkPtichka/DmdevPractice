package com.dmdev.oop.lesson3;

public class ComputerLesson3 {
    // поля класса или как еще называют состояние класса

    int ssd = 900;
    long ram = 1024;

    //Конструктор. Тут мы объевляем инструкции.
    public ComputerLesson3() {
        System.out.println("Я был создан!");
    }

    /* Мы можем создовать несколько конструкторов! Для необходимости, ведь конструктор используется
     * для инициализации наших объектов. То мы можем инициаолизировть определенный объект.
     * Т.е. например определенные поля.
     *
     * Другими словами:
     */
    ComputerLesson3(int kSsd) {
        ssd = kSsd; //Kssd - параметр который мы передаем поле ssd
        ram = 0; //Мы можем делать так, мы изм. знач. переменной ram
    }

    ComputerLesson3(int kSsd, int kRam) {
        ssd = kSsd;
        ram = kRam;
    }



    //Эксперемент
//    ComputerLesson3(int kSsd, int kRam){
//        ssd = kSsd;
//        ram = kSsd;
//    }

    void load() {
        System.out.println("Рагружено!");

    }

    void printloadC() {
        load();
        System.out.println("Ssd" + ssd);
        System.out.println("Ram" + ram);

    }
}
