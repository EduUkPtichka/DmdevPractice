package lesson2;

import lesson2.weapon.Bow;
import lesson2.weapon.Sword;

public class WeaponRunner {
    public static void main(String[] args) {
        Archer<Bow> archer1 = new Archer<>("Леголас", 10);
        archer1.setWeapon(new Bow());

        //Но мы не ограничены и Воену можем дать Лук: Это и возможность и проблема.

        Archer<Bow> archer2 = new Archer<>("Леголас", 10);
        archer2.setWeapon(new Bow());


        Warrior<Sword> swordWarrior = new Warrior<Sword>("ЛукаГудван", 32);
        swordWarrior.setWeapon(new Sword());
    }
}
