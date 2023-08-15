package com.dmdev.lesson4;

import com.dmdev.lesson2.ComputerL2;
import com.dmdev.lesson2.RamL2;
import com.dmdev.lesson2.SsdL2;

public class LapTopL4 extends ComputerL4 {

    private int weight;

    {
        System.out.println("Блок инициализации LapTopL4");

    }

    static{
        System.out.println("Статик блок инициализации LapTopL4");
        new ComputerL4();
    }

    public LapTopL4(SsdL4 ssd, RamL4 ram, int weight) {
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

    public LapTopL4(){
        System.out.println("Конструтор LapTop4!");
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
