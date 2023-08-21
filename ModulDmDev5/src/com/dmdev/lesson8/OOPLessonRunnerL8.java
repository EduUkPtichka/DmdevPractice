package com.dmdev.lesson8;

import com.dmdev.lesson7.*;

import java.util.Random;

public class OOPLessonRunnerL8 {
    public static void main(String[] args) {

        ComputerL8 lapTopL8 = new LapTopL8(new SsdL8(2222), new RamL8(766745), 4);
        ComputerL8 mobileL8 = new MobileL8(new SsdL8(2222), new RamL8(766745));

        print(lapTopL8, mobileL8);
        printRelazezes(lapTopL8,mobileL8);

        //PrintableL8.generateRandom(); //Как бу то бы закрытая реализация!
    }

    public static void print(PrintableL8... objects1) {
        for (PrintableL8 object1 : objects1) {
            object1.print();
        }

    }

    public static void printRelazezes(PrintableL8... objects2) {
        for (PrintableL8 object1 : objects2) {
            object1.printRelazezes();
        }

    }



}
