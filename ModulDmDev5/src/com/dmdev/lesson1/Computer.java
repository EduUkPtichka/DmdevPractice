package com.dmdev.lesson1;

public class Computer {

    //Инкопсуляция - значит вскрытия данных.
    private Ssd ssd;
    private Ram ram;

    public Computer(Ssd ssd, Ram ram) {
        this.ssd = ssd;
        this.ram = ram;
    }

    public void load(){
        System.out.println("Запуск Computer!");
    }
}
