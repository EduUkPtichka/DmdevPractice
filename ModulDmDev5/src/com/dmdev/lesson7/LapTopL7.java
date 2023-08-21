package com.dmdev.lesson7;

public class LapTopL7 extends ComputerL7 {

    private int weight;

    public LapTopL7(Ssd ssd, Ram ram, int weight) {
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
