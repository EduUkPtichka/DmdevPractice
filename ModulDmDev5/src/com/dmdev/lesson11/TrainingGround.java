package com.dmdev.lesson11;

public class TrainingGround {
    public static void main(String[] args) {
        Hero warrior = new Warrior("Джагернаут", 800);
        Hero mage = new Mage("Эильфа", 10);
        Hero archer = new Archer("Гудлук", 15);


        Enemy enemy = new Enemy("Зомби", 56434);
        attackEnemy(enemy, warrior, mage, archer);
    }

    public static void attackEnemy(Enemy enemy, Hero... heroes) {
        while (enemy.isAlive()) {
            for (Hero hero : heroes) {
                if (enemy.isAlive()) {
                    hero.attackEnemy(enemy);
                }
            }
        }
    }
}
