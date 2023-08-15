package com.dmdev.lesson2;

import com.dmdev.lesson1.Ram;
import com.dmdev.lesson1.Ssd;

public class LapTop extends ComputerL2{

    private int weight;
    public LapTop(SsdL2 ssd, RamL2 ram, int weight) {
        super(ssd, ram);
        this.weight = weight;
        super.load();

        super.getRam();
        super.getSsd();

        getRam(); // можно еще так. Но super(), пригодится при полиморфизме.
        getSsd();

        //super.setRam(32); // Нельзя!
        //super.setSsd(2); // Нельзя!
    }

    public LapTop(){
        System.out.println("Конструтор LapTop!");
    }

    public void open(){
        System.out.println("Вы открыли LapTop");
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
