package com.dmdev.oop.lesson7;

public class CompositionRunner {

    public static void main(String[] args) {
        Ram ram = new Ram(1000);

        // Интересно то что компилятор не ругается на
        //new Computer(ram)

        Computer computer = new Computer(ram);
        computer.printComputer();
    }
}
