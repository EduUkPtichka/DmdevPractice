package lesson2;

public class Mage<T> extends Hero<T>{
    public Mage(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " Стреляю из жезла! " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
