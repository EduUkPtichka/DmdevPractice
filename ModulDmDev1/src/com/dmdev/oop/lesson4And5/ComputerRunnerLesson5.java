package com.dmdev.oop.lesson4And5;

public class ComputerRunnerLesson5 {
    // тестер

    public static void main(String[] args) {

        //Непосредственное создание объекта!
        ComputerLesson5 computerA = new ComputerLesson5();
        ComputerLesson5 computerB = new ComputerLesson5(5);
        ComputerLesson5 computerC = new ComputerLesson5(67,100);
        ComputerLesson5 computerD = new ComputerLesson5(12,44);

        computerA.load(true);
        computerA.load();
        computerB.load();
        computerC.load();


        System.out.println("Ram: " + computerA.ram);
        System.out.println("Set: " + computerA.ssd);

        System.out.println("Ram: " + computerD.ram);
        System.out.println("Set: " + computerD.ssd);

        System.out.println("Ram: " + computerB.ram);
        System.out.println("Set: " + computerB.ssd);

        System.out.println("Set: " + computerC.ram);
        System.out.println("Set: " + computerC.ssd);

//        computerA.printloadC();
//        computerB.printloadC();
    }

}
