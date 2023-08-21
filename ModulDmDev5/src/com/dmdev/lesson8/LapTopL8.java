package com.dmdev.lesson8;

import com.dmdev.lesson7.ComputerL7;
import com.dmdev.lesson7.Ram;
import com.dmdev.lesson7.Ssd;

public class LapTopL8 extends ComputerL8 {

    private int weight;

    public LapTopL8(SsdL8 ssd, RamL8 ram, int weight) {
        super(ssd, ram);
        this.weight = weight;
    }

    @Override
    public void load() {
        open();
        System.out.println("Я загрузился");
    }

    @Override
    public void print() {
        super.print();
        System.out.println("weight: " + weight);
    }

    public void open() {
        System.out.println("Я открыл крышку");
    }

    public int getWeight() {
        return weight;
    }
}
