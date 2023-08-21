package com.dmdev.lesson5;

import com.dmdev.lesson4.ComputerL4;

public class LapTopL5 extends ComputerL5 {

    private int weight;

    {
        System.out.println("Блок инициализации LapTopL4");

    }

    static{
        System.out.println("Статик блок инициализации LapTopL4");
        new ComputerL4();
    }

    public LapTopL5(SsdL5 ssd, RamL5 ram, int weight) {
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

    public LapTopL5(){
        System.out.println("Конструтор LapTop4!");
    }

    @Override
    public void addLoad() {

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
