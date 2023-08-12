package com.dmdev.oop.lesson2;

public class ComputerRunner {
    // тестер

    public static void main(String[] args) {

        //Непосредственное создание объекта --->
        Computer computer; // Тип Computer который мы создали и переменна computer;
                           // Вообще мы создали новый тип данных.

        computer = new Computer(); // Инициализация
        //<---

        computer.load(); // через точку мы обращаемся к св-ва нашего объекта.

        System.out.println("Ram: " + computer.ram);
        System.out.println("Set: " + computer.ssd);

        // System.out.println(printLoadC()); так делать нельзя !
        computer.printloadC();
    }

}
