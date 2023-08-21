package lesson1;

import java.io.Serializable;

public class User extends Persson implements Serializable, Comparable<User> {

    String name;

    public User(LongOne id, String name) {
        super(id);
        this.name = name;
    }

    @Override
    public int compareTo(User o) {
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
