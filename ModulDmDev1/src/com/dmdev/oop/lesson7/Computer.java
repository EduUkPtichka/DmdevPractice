package com.dmdev.oop.lesson7;

public class Computer {
    private Ram ram;

    public Computer(Ram ram) {
        this.ram = ram;
    }

    public void printComputer(){
        System.out.println("Computer Ram: " + ram.getValue());
    }
}
