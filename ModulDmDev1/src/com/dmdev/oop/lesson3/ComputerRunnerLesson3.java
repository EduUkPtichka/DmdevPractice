package com.dmdev.oop.lesson3;

import com.dmdev.oop.lesson3.ComputerLesson3;

public class ComputerRunnerLesson3 {
    // тестер

    public static void main(String[] args) {

        //Непосредственное создание объекта!
        ComputerLesson3 computerA = new ComputerLesson3();
        ComputerLesson3 computerB = new ComputerLesson3(5);
        ComputerLesson3 computerC = new ComputerLesson3(2);


        computerA.load();
        computerB.load();
        computerC.load();

        System.out.println("Ram: " + computerA.ram);
        System.out.println("Set: " + computerA.ssd);

        System.out.println("Ram: " + computerB.ram);
        System.out.println("Set: " + computerB.ssd);

        System.out.println("Set: " + computerC.ram);
        System.out.println("Set: " + computerB.ssd);

//        computerA.printloadC();
//        computerB.printloadC();
    }

}
