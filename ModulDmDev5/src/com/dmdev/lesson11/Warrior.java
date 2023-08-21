package com.dmdev.lesson11;

public class Warrior extends Hero{
    public Warrior(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " Атакую мечем! " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
