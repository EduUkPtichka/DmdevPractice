package lesson2;

public abstract class Hero<T> {
    private String name;
    private int damage;
    private T weapon;

    public Hero(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public abstract void attackEnemy(Enemy enemy);

    public T getWeapon() {
        return weapon;
    }

    public void setWeapon(T weapon) {
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
